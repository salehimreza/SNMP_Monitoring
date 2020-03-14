package co.mahsan.snmpmonitoring.controller.rest;

import co.mahsan.snmpmonitoring.model.DAO.Repository.userrepo.UserRepository;
import co.mahsan.snmpmonitoring.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User>  getUsers(){
        List<User> users = userRepository.findAll();
        return users;
    }
}
