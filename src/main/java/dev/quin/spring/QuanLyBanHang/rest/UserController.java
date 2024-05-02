package dev.quin.spring.QuanLyBanHang.rest;

import dev.quin.spring.QuanLyBanHang.entity.User;
import dev.quin.spring.QuanLyBanHang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{name}")
    public List<User> findName(@PathVariable String name){
        return this.userService.getUserByUsername(name);
    }
}
