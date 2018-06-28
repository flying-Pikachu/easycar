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

    /**
     * create by: xzp
     * description: 检查密码是否正确
     * create time: 上午11:11 2018/6/28
     *
     * @param userName 用户输入的用户名
     * @param userPassword 用户输入的密码
     * @return boolean
     */
    public boolean checkPassword(String userName, String userPassword) {
        if (userServices.searchUserByName(userName).getUserpassword().equals(userPassword))
            return true;
        else
            return false;
    }

    /**
     * create by: xzp
     * description: 检查用户登录的处理器，密码正确返回首页，密码错误返回原始界面
     * create time: 上午11:12 2018/6/28
     *
     * @param model 往前端传递参数的对象
     * @param userName 用户传来的名字
     * @param userPassword 用户传来的密码
     * @return java.lang.String
     */
    @RequestMapping("check")
    public String checkUser(Model model, String userName, String userPassword) {
        if (checkPassword(userName, userPassword))
            return "FrontPage";
        model.addAttribute("userName", userName);
        return "Login";
    }

    /**
     * create by: xzp
     * description: 检查管理员登录的处理器，密码正确返回首页，密码错误返回原始界面
     * create time: 上午11:16 2018/6/28
     *
     * @param model 往前端传递参数的对象
     * @param userName 管理员传来的名字
     * @param userPassword 管理员传来的密码
     * @return java.lang.String
     */
    @RequestMapping("checkManager")
    public String checkManager(Model model, String userName, String userPassword) {
        if (checkPassword(userName, userPassword)) {
            if (userServices.searchUserByName(userName).getIsmanager() == 1) {
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

}
