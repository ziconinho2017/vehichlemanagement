package edu.miu.fleetapp;

import edu.miu.fleetapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class ApplicationController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/index")
    public String goHome(){
       return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/logout")
    public String logout(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/accessDenied")
    public String fail(){
        return "accessDenied";
    }

    @RequestMapping(value = "/profile")
    public String profile(Model model, Principal principal){
        String un = principal.getName();
        model.addAttribute("employeee",employeeService.findByUsername(un));
        return "profile";
    }
}
