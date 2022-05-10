package edu.miu.fleetapp.controllers;

import edu.miu.fleetapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

public class ProfileController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/profile")
    public String profile(Model model, Principal principal){
        String un = principal.getName();
        model.addAttribute("employeee",employeeService.findByUsername(un));
        return "profile";
    }

}
