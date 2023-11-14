package ru.pirogov.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.pirogov.web.services.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String allUsers(Model model) {
        model.addAttribute("users", userService.getListUsers());
        return "view/users";
    }
}
