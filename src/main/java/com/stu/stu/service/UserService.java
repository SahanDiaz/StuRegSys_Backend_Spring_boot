package com.stu.stu.service;

import com.stu.stu.exception.UserNotFoundException;
import com.stu.stu.model.User;
import com.stu.stu.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class UserService {
    private final UserRepo UserRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.UserRepo = userRepo;
    }
    public User AddUser(User user){

        return  UserRepo.save(user);
    }
    public List<User> FindAllUsers(){
        return UserRepo.findAll();
    }
    public User UpdateUser(User user){
        return UserRepo.save(user);
    }
    public User FindUserById(Long id){
        return UserRepo.getById(id);
////                .orElseThrow(() ->
////                new UserNotFoundException("User by id "+id+" was not found") );
//    }
////    public void DeleteUser(Long id){
////        void DeleteUserById(id){}
    }

}
