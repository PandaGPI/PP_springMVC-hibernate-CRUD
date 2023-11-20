package ru.pirogov.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.pirogov.web.models.User;
import ru.pirogov.web.services.UserService;

@Controller
public class UserController {


    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String allUsers(Model model) {
        model.addAttribute("users", userService.getListUsers());
        return "view/users";
    }

    @GetMapping("/add")
    public String add(Model model) {
    User user = new User();
    model.addAttribute("user", user);
        return "view/addUser";
    }

    @PostMapping("/saveInfo")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:/";
    }

    @GetMapping("/updateInfo")
    public String updateUser(@RequestParam("id") Long id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "view/addUser";
    }

    @PostMapping("/delInfo")
    public String deleteUser(@RequestParam("id") Long id) {
        userService.delete(id);
        return "redirect:/";
    }

}
