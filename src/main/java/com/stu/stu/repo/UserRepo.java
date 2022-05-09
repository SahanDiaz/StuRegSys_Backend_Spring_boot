package com.stu.stu.repo;

import com.stu.stu.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,String> {
    void DeleteUserById(int id);

    Optional<User> FindUserById(int id);
}
