package com.stu.stu.repo;

import com.stu.stu.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepo extends JpaRepository<User,Long> {
//    void DeleteUserById(Long id);

//    Optional<User> FindUserById(Long id);
}
