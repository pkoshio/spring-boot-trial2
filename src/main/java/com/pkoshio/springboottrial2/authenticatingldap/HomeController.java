package com.pkoshio.springboottrial2.authenticatingldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/ldap")
    public String index() {
        return "Welcome to the home page!";
    }
}
