package com.springapp.mvc.service;

import com.springapp.mvc.entity.Lesson;
import com.springapp.mvc.entity.Role;
import com.springapp.mvc.entity.Theme;
import com.springapp.mvc.entity.User;
import com.springapp.mvc.repository.LessonRepository;
import com.springapp.mvc.repository.RoleRepository;
import com.springapp.mvc.repository.ThemeRepository;
import com.springapp.mvc.repository.UserRepository;
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
    private LessonRepository lessonRepository;


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
			userAdmin.setEmail("admin@admin.ru");
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			userAdmin.setPassword(encoder.encode("pwd"));
			List<Role> roles = new ArrayList<Role>();
			roles.add(roleAdmin);
			roles.add(roleUser);
			userAdmin.setRoles(roles);
			userRepository.save(userAdmin);

            Theme vocabTheme = new Theme();
            vocabTheme.setTitle("Vocabulary");
            Lesson beard = new Lesson();
            beard.setTitle("beard");
            beard.setDescription("beard desc");
            Lesson teeth = new Lesson();
            teeth.setTitle("teeth");
            teeth.setDescription("teeth desc");
            List<Lesson> faceList = new ArrayList<Lesson>();
            faceList.add(beard);
            faceList.add(teeth);
            vocabTheme.setLessons(faceList);
            lessonRepository.save(teeth);
            lessonRepository.save(beard);
            themeRepository.save(vocabTheme);


            Theme gramarTheme = new Theme();
            gramarTheme.setTitle("Gramatic");
            Lesson beard2 = new Lesson();
            beard2.setTitle("beard2");
            beard2.setDescription("beard desv");
            Lesson teeth2 = new Lesson();
            teeth2.setTitle("teeth2");
            teeth2.setDescription("descs");
            List<Lesson> faceList2 = new ArrayList<Lesson>();
            faceList2.add(beard2);
            faceList2.add(teeth2);
            gramarTheme.setLessons(faceList2);
            lessonRepository.save(teeth2);
            lessonRepository.save(beard2);
            themeRepository.save(gramarTheme);

            Theme slangTheme = new Theme();
            gramarTheme.setTitle("Slang");
            Lesson beard3 = new Lesson();
            beard3.setTitle("beard3");
            beard3.setDescription("beard desv3");
            Lesson teeth3 = new Lesson();
            teeth3.setTitle("teeth3");
            teeth3.setDescription("descs3");
            List<Lesson> faceList3 = new ArrayList<Lesson>();
            faceList3.add(beard3);
            faceList3.add(teeth3);
            gramarTheme.setLessons(faceList3);
            lessonRepository.save(teeth3);
            lessonRepository.save(beard3);
            themeRepository.save(slangTheme);

		}

	}
}
