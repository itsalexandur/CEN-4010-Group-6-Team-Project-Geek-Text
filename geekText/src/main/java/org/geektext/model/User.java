package org.geektext.model;

public class User {


    private final int id;
    private final String address;
    private final String fullname;
    private final String password;
    private final String username;



    public User(int id, String address, String fullname, String password, String username)
    {
        this.id = id;
        this.address = address;
        this.fullname = fullname;
        this.password = password;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public String getAddress(){
        return address;
    }
    public String getPassword() {
        return password;
    }

    public String getFullname() {
        return fullname;
    }

    public String getUsername() {
        return username;
    }

}
