package com.stu.stu.model;

import javax.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private String  RoleID;
    private String RoleName;

    public Role(String roleID, String roleName) {
        RoleID = roleID;
        RoleName = roleName;
    }

    public Role() {
    }

    public String GetRoleID() {
        return RoleID;
    }

    public void SetRoleID(String roleID) {
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
