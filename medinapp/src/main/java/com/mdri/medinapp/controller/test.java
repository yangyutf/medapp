package com.mdri.medinapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping("/login")
    public String login() {

        return "尚未登录，请登录!";
    }
}
