package com.model;

public class user {
    private String username;
    private String fname;
    private String lname;
    private String role;
    private int utaid;
    private int phone;
    private String vehicleno;
    private int parking;
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getFname(){
        return fname;
    }
    public void setFname(String fname){
        this.fname = fname;
    }
    public String getLname(){
        return lname;
    }
    public void setLname(String lname){
        this.lname = lname;
    }

    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }

    public int getUtaid(){
        return utaid;
    }
    public void setUtaid(int utaid){
        this.utaid = utaid;
    }

    public int getPhone(){
        return phone;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }


    public String getVehicle(){
        return vehicleno;
    }
    public void setVehicle(String vehicleno){
        this.vehicleno = vehicleno;
    }

    public int getParking(){
        return parking;
    }
    public void setParking(int parking){
        this.parking = parking;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String Password){
        this.password = password;
    }

}