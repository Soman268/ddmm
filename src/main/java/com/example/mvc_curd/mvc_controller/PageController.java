package com.example.mvc_curd.mvc_controller;

import com.example.mvc_curd.mvcmodel.User_Repository;
import com.example.mvc_curd.mvcmodel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class PageController {


    @Autowired
    User_Repository user_repository;
    @GetMapping(value ="/addpage")
    public String add_user(){
        return "user_add";
    }

    // front page of the application.
    @GetMapping(value ="/")
    public String view_data(Model model){
        ArrayList<User> names_return = (ArrayList<User>)  user_repository.findAll();
        for(User x:names_return) {
            System.out.println(x.getName()+" ,");
        }
        model.addAttribute("users",names_return);
        return "index";
    }

    @GetMapping(value ="/deleteuser/{idx}")
    public String delete_user(@PathVariable("idx")long user_id){
        user_repository.deleteById(user_id);
        return "index";
    }
    @PostMapping(value ="/add")
    public String add_user1(@ModelAttribute("user") User user){
        user_repository.save(user);
        return "index";
    }


}
