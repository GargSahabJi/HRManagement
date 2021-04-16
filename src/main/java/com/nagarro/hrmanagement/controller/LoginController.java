package com.nagarro.hrmanagement.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/login")
    public String postLogin(@ModelAttribute("user") User user, Model model, HttpServletRequest request) {
        User validUser = userService.validateUser(user);
        if (validUser != null) {
            request.getSession().setAttribute("userInfo", validUser);
            return "redirect:/employee";
        }
        return "redirect:Login";
    }
}
