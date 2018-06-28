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

    @RequestMapping("checkManager")
    public String checkManager(Model model, String userName, String userPassword) {
        User user = userServices.searchUserByName(userName);
        System.out.println(user);
        if (user.getUserpassword().equals(userPassword)) {
            if (user.getIsmanager() == 1) {
                // 从管理员界面跳转并且是管理员
                // 管理员界面
                return "ManagerFrontPage";
            } else {
                // 从管理员界面跳转不是管理员
                // 跳转回管理员登录界面
                model.addAttribute("userName", userName);
                return "ManagerLogin";
            }
        } else {
            model.addAttribute("userName", userName);
            return "Login";
        }
    }

    @RequestMapping("goLogin")
    public String loginInit() {
        return "Login";
    }
}