package com.stu.stu.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "User")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long UserID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RoleID",referencedColumnName = "roleID")
    private Role roleID;
    private boolean active;
    private String fullName;
    private int stuRegNum;
    private String email;
    private String dob;
    private int contactNum;

    public User(Long userID, Role roleID, boolean active, String fullName, int stuRegNum, String email, String dob, int contactNum) {
        this.UserID = userID;
        this.roleID = roleID;
        this.active = active;
        this.fullName = fullName;
        this.stuRegNum = stuRegNum;
        this.email = email;
        this.dob = dob;
        this.contactNum = contactNum;
    }

    public User() {

    }

    public Long GetUserID() {
        return UserID;
    }

    public void SetUserID(Long userID) {
        UserID = userID;
    }

    public Role GetRoleID() {
        return roleID;
    }

    public void SetRoleID(Role roleID) {
        this.roleID = roleID;
    }

    public boolean IsActive() {
        return active;
    }

    public void SetActive(boolean active) {
        this.active = active;
    }

    public String GetFullName() {
        return fullName;
    }

    public void SetFullName(String fullName) {
        this.fullName = fullName;
    }

    public int GetStuRegNum() {
        return stuRegNum;
    }

    public void SetStuRegNum(int stuRegNum) {
        this.stuRegNum = stuRegNum;
    }

    public String GetEmail() {
        return email;
    }

    public void SetEmail(String email) {
        this.email = email;
    }

    public String GetDOB() {
        return dob;
    }

    public void SetDOB(String DOB) {
        this.dob = DOB;
    }

    public int GetContactNum() {
        return contactNum;
    }

    public void SetContactNum(int contactNum) {
        this.contactNum = contactNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserID=" + UserID +
                ", RoleID=" + roleID +
                ", Active=" + active +
                ", FullName='" + fullName + '\'' +
                ", StuRegNum=" + stuRegNum +
                ", Email='" + email + '\'' +
                ", DOB='" + dob + '\'' +
                ", ContactNum=" + contactNum +
                '}';
    }


}
