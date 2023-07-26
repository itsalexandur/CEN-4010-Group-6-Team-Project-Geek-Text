package org.geektext.model;

import jakarta.persistence.*;


@Entity
@Table(name = "authors")
public class Author {

    public Author(){}


    public Author(String firstName, String lastName, String bio, String publisher) {

        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setBio(bio);
        this.setPublisher(publisher);

    }



    @Id
    @Column (name = "authorID")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto generates incremental ID value
    private String id;


    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;

    @Column(name = "biography", nullable = false)
    private String bio;

    @Column(name = "publisher")
    private String publisher;




    // Get+Set Methods

    public String getId() {return id;}
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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}



