package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET, value="/")
    public String start(ModelMap model) {
        return "start";
    }

//    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
//    public
//    @ResponseBody
//    String listUsersJson(ModelMap model) throws JSONException {
//        JSONArray userArray = new JSONArray();
//        for (User user : userRepository.findAll()) {
//            JSONObject userJSON = new JSONObject();
//            userJSON.put("id", user.getId());
//            userJSON.put("firstName", user.getFirstName());
//            userJSON.put("lastName", user.getLastName());
//            userJSON.put("email", user.getEmail());
//            userArray.put(userJSON);
//        }
//        return userArray.toString();
//    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user, BindingResult result) {
        userRepository.save(user);
        return "redirect:/";
    }

    @RequestMapping("/delete/{userId}")
    public String deleteUser(@PathVariable("userId") Long userId) {
        userRepository.delete(userRepository.findOne(userId));
        return "redirect:/";
    }


}