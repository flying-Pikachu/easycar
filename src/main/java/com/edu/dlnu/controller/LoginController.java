package com.edu.dlnu.controller;

import com.edu.dlnu.been.User;
import com.edu.dlnu.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;


@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private UserServices userServices;

    @RequestMapping("check")
    public String checkUser(Model model, String userName, String userPassword) {
        User user = userServices.searchUserByName(userName);
        System.out.println(user);
        if (user.getUserpassword().equals(userPassword)) {
            return "FrontPage";
        } else {
            model.addAttribute("userName", userName);
            return "Login";
        }
    }

    public String checkManager(Model model, String userName, String userPassword) {
        
    }

    @RequestMapping("goLogin")
    public String loginInit() {
        return "Login";
    }
}
