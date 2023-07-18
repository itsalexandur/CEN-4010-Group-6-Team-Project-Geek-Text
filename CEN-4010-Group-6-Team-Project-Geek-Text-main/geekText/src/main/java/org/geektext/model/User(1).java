package org.geektext.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    public User(){}

    public User(String username, String password) {
        this.setUserName(username);
        this.setPassword(password);
    }

    public User(String username, String password,String firstName, String lastName, String address) {

        this.setUserName(username);
        this.setPassword(password);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAddress(address);

    }


    @Id
    @Column (name = "userID")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto generates incremental ID value
    private long id;



    // Get+Set Methods
    @Column(name ="username")
    private String userName;

    @Column(name ="password")
    private String password;

    @Column(name ="firstname")
    private String firstName;

    @Column(name ="lastname")
    private String lastName;

    @Column(name ="address")
    private String address;




    // Get + Set Methods

    public long getId() {
        return id;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
