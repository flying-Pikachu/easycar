package com.edu.dlnu.controller;

import com.edu.dlnu.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;


@Controller
@RequestMapping("register")
public class RegisterController {

    @Autowired
    private UserServices userServices;

    /**
     * create by: xzp
     * description: 判断用户是否存在
     * create time: 上午11:19 2018/6/28
     *
     * @param userName 输入的用户名
     * @return boolean
     */
    public boolean isExist(String userName) {
        return userServices.searchUserByName(userName) != null;
    }

    /**
     * create by: xzp
     * description: 通过用户名和密码进行插入
     * create time: 下午1:01 2018/6/28
     *
     * @param userName 想要插入的用户名
     * @param userPassword 密码
     * @return String
     */
    @RequestMapping("userInsert")
    public String Insert(Model model, String userName, String userPassword) {
        if (!isExist(userName)) {
            if (userServices.insert(userName, userPassword))
                return "FrontPage";
            else {
                model.addAttribute("isExist", true);
                return "Register";
            }
        } else {
            model.addAttribute("isExist", true);
            return "Register";
        }
    }

}
