package com.example.spring_git.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
    @RequestMapping(value = "/member/home")
    public void homeAction() {
        
    }
    @RequestMapping(value = "/member/list")
    public void memberAction() {
        
    }
    @RequestMapping(value = "/member/login")
    public void loginAction() {
        
    }
    @RequestMapping(value = "/member/logout")
    public void logoutAction() {
        
    }
    @RequestMapping(value = "/memeber/delete")
    public void deleteAction() {
        
    }
}