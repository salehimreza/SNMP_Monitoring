package co.mahsan.snmpmonitoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping("/home")
    public String homePage(){
        return "home";
    }
}
