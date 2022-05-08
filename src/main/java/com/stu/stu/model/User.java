package com.stu.stu.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "User")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private int UserID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RoleID",referencedColumnName = "RoleID")
    private Role RoleID;
    private boolean Active;
    private String FullName;
    private int StuRegNum;
    private String Email;
    private String DOB;
    private int ContactNum;

    public User(int userID, Role roleID, boolean active, String fullName, int stuRegNum, String email, String DOB, int contactNum) {
        UserID = userID;
        RoleID = roleID;
        Active = active;
        FullName = fullName;
        StuRegNum = stuRegNum;
        Email = email;
        this.DOB = DOB;
        ContactNum = contactNum;
    }

    public User() {

    }

    public int GetUserID() {
        return UserID;
    }

    public void SetUserID(int userID) {
        UserID = userID;
    }

    public Role GetRoleID() {
        return RoleID;
    }

    public void SetRoleID(Role roleID) {
        RoleID = roleID;
    }

    public boolean IsActive() {
        return Active;
    }

    public void SetActive(boolean active) {
        Active = active;
    }

    public String GetFullName() {
        return FullName;
    }

    public void SetFullName(String fullName) {
        FullName = fullName;
    }

    public int GetStuRegNum() {
        return StuRegNum;
    }

    public void SetStuRegNum(int stuRegNum) {
        StuRegNum = stuRegNum;
    }

    public String GetEmail() {
        return Email;
    }

    public void SetEmail(String email) {
        Email = email;
    }

    public String GetDOB() {
        return DOB;
    }

    public void SetDOB(String DOB) {
        this.DOB = DOB;
    }

    public int GetContactNum() {
        return ContactNum;
    }

    public void SetContactNum(int contactNum) {
        ContactNum = contactNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserID=" + UserID +
                ", RoleID=" + RoleID +
                ", Active=" + Active +
                ", FullName='" + FullName + '\'' +
                ", StuRegNum=" + StuRegNum +
                ", Email='" + Email + '\'' +
                ", DOB='" + DOB + '\'' +
                ", ContactNum=" + ContactNum +
                '}';
    }
}
