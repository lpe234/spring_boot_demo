package com.example.controller;

import com.example.entity.User;
import com.example.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Restful风格接口
 * Created by lpe234 on 2017/2/15.
 */


@RequestMapping("/users")
@RestController
@EnableAutoConfiguration
public class UserController {


    @Autowired
    private UserRepository userRepository;

    /**
     * 获取全部用户
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    List<User> getUsersList() {
        return userRepository.findAll();
    }

    /**
     * 创建新用户
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    User createUser(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }

    /**
     * 获取特定用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User getUser(@PathVariable("id") Long id) {
        return userRepository.findUser(id);
    }

    /**
     * 更新特定用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    User updateUser(@PathVariable("id") Long id) {
        return userRepository.findUser(id);
    }

    /**
     * 删除特定用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    User deleteUser(@PathVariable("id") Long id) {
        User user = userRepository.findUser(id);
        userRepository.delete(user);

        return user;
    }
}
