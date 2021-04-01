package com.example.myapplication.objects;


import static com.example.myapplication.activities.MainLoadingPage.CUSTOMER;

public class Customer {
    private String userId;
    private String username;
    private String email;
    private int phoneNumber;

    public Customer() {
    }

    public Customer(String userId,String username, String email, int phoneNumber) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
