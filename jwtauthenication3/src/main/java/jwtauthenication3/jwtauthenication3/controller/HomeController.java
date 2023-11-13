package jwtauthenication3.jwtauthenication3.controller;

import jwtauthenication3.jwtauthenication3.entity.User;
import jwtauthenication3.jwtauthenication3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

@GetMapping("/user")
    public List<User> getUser(){

        System.out.println("HEllo Bhayio");
        return userService.getUser();
    }






}
