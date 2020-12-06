package com.cashew.user.controller;

import com.cashew.user.VO.ResponseTemplateVO;
import com.cashew.user.entity.User;
import com.cashew.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) throws JSONException {
        log.info("Inside Save User of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long registrationNumber) throws JSONException {
        log.info("Inside getUserWithDepartment User of UserController");
        return userService.getUserWithDepartment(registrationNumber);
    }
}
