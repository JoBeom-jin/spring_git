package com.example.spring_git.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping(value = "/home")
public String action(){
return "index";
}
}