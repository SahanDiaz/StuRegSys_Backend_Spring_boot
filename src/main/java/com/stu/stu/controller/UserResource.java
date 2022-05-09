package com.stu.stu.controller;

import com.stu.stu.model.User;
import com.stu.stu.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {

    private final UserService UserService;

    public UserResource(UserService userService){
        this.UserService = userService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> GetAllUsers(){
        List<User> users = UserService.FindAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> GetUserById(@PathVariable("id") int id){
        User user = UserService.FindUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<User> AddUser(@RequestBody User user) {
        User newUser = UserService.AddUser(user);
        return new ResponseEntity<>(newUser,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<User> UpdateUser(@RequestBody User user) {
        User updateUser = UserService.UpdateUser(user);
        return new ResponseEntity<>(updateUser,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteUser(@PathVariable("id") int id) {
        UserService.DeleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
