package com.demo.controller;

import com.demo.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lwx on 2019/6/22.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/listUsers")
    public List<User> listUsers(){
        List<User> list = new ArrayList();
        list.add(new User(1, "zhangsan", 20));
        list.add(new User(2, "lisi", 22));
        list.add(new User(3, "wangwu", 20));
        return list;
    }
}
