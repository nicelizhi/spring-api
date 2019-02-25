package com.company.project.controller;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.company.project.models.YpcUsers;
import com.company.project.models.UserRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@RestController    // This means that this class is a Controller
@RequestMapping(path="/users") // This means URL's start with /demo (after Application path)
public class UsersController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        YpcUsers n = new YpcUsers();
        n.setUserName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<YpcUsers> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }


    @GetMapping(path="/del/{id}")
    public @ResponseBody void delUser(@RequestParam YpcUsers user){
        userRepository.delete(user);
    }

    @GetMapping(path="/signup")
    public @ResponseBody void signUp(@RequestParam YpcUsers user) {
        //user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        //userRepository.save(user);
    }

    @PostMapping(path = "/login")
    public @ResponseBody String login(@RequestParam String phone, @RequestParam String password){
        String md5Password = password;

        return md5Password;



    }

    @GetMapping(path = "/login")
    public @ResponseBody String getLogin(@RequestParam String phone, @RequestParam String password){
        String md5Password = password;
        return md5Password;
    }

    /***
     *
     * @author  Steven Liu
     * @param Integer user_id
     * @return Optional
     *
     */
    @GetMapping(path = "/detail")
    public @ResponseBody Optional<YpcUsers> getDetail(@RequestParam Integer user_id) {
        return userRepository.findById(user_id);
    }


}