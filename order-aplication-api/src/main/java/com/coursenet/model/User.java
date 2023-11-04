package com.coursenet.model;

public class User {

    private String Id;

    private String userName;

    private String password;

    private String email;

    private String address;

    private String noHp;

    public User(String id, String userName, String password, String email, String address, String noHp) {
        Id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.address = address;
        this.noHp = noHp;
    }

    public User() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
}
