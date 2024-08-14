package com._xtech.jwt_authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portal")
public class PortalController {

    @GetMapping("/home")
    public String getHomePage(){
        return "Homepage with Public Access";
    }

    @GetMapping("/user")
    public String getUserPortal(){
        return "This is the User's Portal";
    }

    @GetMapping("/admin")
    public String getAdminPortal(){
        return "This is the Admins Portal";
    }
}
