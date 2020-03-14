package co.mahsan.snmpmonitoring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/home")
public class AdminController {
    @GetMapping
    public String homePage(ModelAndView modelAndView){
        return "home";
    }

}
