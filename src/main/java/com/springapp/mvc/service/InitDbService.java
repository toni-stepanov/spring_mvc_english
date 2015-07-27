package com.springapp.mvc.service;

import com.springapp.mvc.entity.Role;
import com.springapp.mvc.entity.Theme;
import com.springapp.mvc.entity.User;
import com.springapp.mvc.entity.Word;
import com.springapp.mvc.repository.RoleRepository;
import com.springapp.mvc.repository.ThemeRepository;
import com.springapp.mvc.repository.UserRepository;
import com.springapp.mvc.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

    @Autowired
    private ThemeRepository themeRepository;

    @Autowired
    private WordRepository wordRepository;


	@PostConstruct
	public void init() {
		if (roleRepository.findByName("ROLE_ADMIN") == null) {
			Role roleUser = new Role();
			roleUser.setName("ROLE_USER");
			roleRepository.save(roleUser);

			Role roleAdmin = new Role();
			roleAdmin.setName("ROLE_ADMIN");
			roleRepository.save(roleAdmin);

			User userAdmin = new User();
			userAdmin.setEnabled(true);
			userAdmin.setMail("admin@admin.ru");
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			userAdmin.setPassword(encoder.encode("pwd"));
			List<Role> roles = new ArrayList<Role>();
			roles.add(roleAdmin);
			roles.add(roleUser);
			userAdmin.setRoles(roles);
			userRepository.save(userAdmin);

            Theme faceTheme = new Theme();
            faceTheme.setTitle("face");
            Word beard = new Word();
            beard.setTitle("beard");
            Word teeth = new Word();
            teeth.setTitle("teeth");
            List<Word> faceList = new ArrayList<Word>();
            faceList.add(beard);
            faceList.add(teeth);
            faceTheme.setWords(faceList);
            wordRepository.save(teeth);
            wordRepository.save(beard);
            themeRepository.save(faceTheme);


            Theme faceTheme2 = new Theme();
            faceTheme2.setTitle("face2");
            Word beard2 = new Word();
            beard2.setTitle("beard2");
            Word teeth2 = new Word();
            teeth2.setTitle("teeth2");
            List<Word> faceList2 = new ArrayList<Word>();
            faceList2.add(beard2);
            faceList2.add(teeth2);
            faceTheme2.setWords(faceList2);
            wordRepository.save(teeth2);
            wordRepository.save(beard2);
            themeRepository.save(faceTheme2);

		}

	}
}
