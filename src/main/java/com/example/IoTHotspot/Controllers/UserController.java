package com.example.IoTHotspot.Controllers;

import com.example.IoTHotspot.Models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController
public class UserController {

    @RequestMapping(value = "index")
    public User index() {
        User user = new User();
        user.setId((long) 10);
        user.setName("User Test");
        user.setEmail("test@domain.com");
        user.setPassword("abc123");
        user.setConfirm_password("abc123");
        user.setToken("#ABC123@321CBA#");
        return user;
    }

    @RequestMapping(value = "create")
    public User create() {
        User user = new User();
        user.setId((long)10);
        user.setName("User Test");
        user.setEmail("test@domain.com");
        user.setPassword("abc123");
        user.setConfirm_password("abc123");
        user.setToken("#ABC123@321CBA#");
        return user;
    }

    @RequestMapping(value = "show/{id}")
    public User show(@PathVariable int id) {
        User user = new User();
        user.setId(id);
        user.setName("User Test");
        user.setEmail("test@domain.com");
        user.setPassword("abc123");
        user.setConfirm_password("abc123");
        user.setToken("#ABC123@321CBA#");
        return user;
    }

    @RequestMapping(value = "edit/{id}")
    public User edit() {
        User user = new User();
        user.setId(10);
        user.setName("User Test");
        user.setEmail("test@domain.com");
        user.setPassword("abc123");
        user.setConfirm_password("abc123");
        user.setToken("#ABC123@321CBA#");
        return user;
    }

    @RequestMapping(value = "delete/{id}")
    public User delete() {
        User user = new User();
        user.setId(10);
        user.setName("User Test");
        user.setEmail("test@domain.com");
        user.setPassword("abc123");
        user.setConfirm_password("abc123");
        user.setToken("#ABC123@321CBA#");
        return user;
    }
    
}
