package com.stu.stu.model;

import javax.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long  RoleID;
    private String RoleName;

    public Role(Long roleID, String roleName) {
        RoleID = roleID;
        RoleName = roleName;
    }

    public Role() {
    }

    public Long GetRoleID() {
        return RoleID;
    }

    public void SetRoleID(Long roleID) {
        RoleID = roleID;
    }

    public String GetRoleName() {
        return RoleName;
    }

    public void SetRoleName(String roleName) {
        RoleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "RoleID=" + RoleID +
                ", RoleName='" + RoleName + '\'' +
                '}';
    }
}
