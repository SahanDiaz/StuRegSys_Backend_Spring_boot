package com.stu.stu.model;

import javax.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private int RoleID;
    private String RoleName;

    public Role(int roleID, String roleName) {
        RoleID = roleID;
        RoleName = roleName;
    }

    public Role() {
    }

    public int GetRoleID() {
        return RoleID;
    }

    public void SetRoleID(int roleID) {
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
