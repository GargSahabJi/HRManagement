/*
* Class name: LoginController
*
* Version info: jdk 1.8
*
* Copyright notice:
* 
* Author info: Arpit Garg
*
* Creation date: 13/Apr/2021
*
* Last updated By: Arpit Garg
*
* Last updated Date: 16/Apr/2021
*
* Description: Login Controller for HR management 
*/
package com.nagarro.hrmanagement.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nagarro.hrmanagement.model.User;
import com.nagarro.hrmanagement.service.UserService;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String getLogin(@ModelAttribute("user") User user) {
        return "Login";
    }

    /**
     * @param user
     * @param model
     * @param request
     * @return login page if user is valid
     */
    @PostMapping("/login")
    public String postLogin(@ModelAttribute("user") User user, Model model, HttpServletRequest request) {
        User validUser = userService.validateUser(user);
        if (validUser != null) {
            request.getSession().setAttribute("userInfo", validUser);
            return "redirect:/employee";
        }
        return "redirect:/login";
    }

    /**
     * Log out the user
     * 
     * @param request
     * @return
     */
    @RequestMapping("/logout")
    public String signOut(HttpServletRequest request) {
        request.getSession().removeAttribute("userInfo");
        request.getSession().invalidate();
        return "redirect:/login";
    }
}
