package com.stu.stu.service;

import com.stu.stu.model.Role;
import com.stu.stu.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class RoleService {
    private final RoleRepo RoleRepo;

    @Autowired
    public RoleService(RoleRepo RoleRepo) {
        this.RoleRepo = RoleRepo;
    }
    public Role AddRole(Role Role){
        Role.SetRoleID(UUID.randomUUID().toString());
        return RoleRepo.save(Role);
    }
}
