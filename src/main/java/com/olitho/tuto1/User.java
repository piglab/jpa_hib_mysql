package com.olitho.tuto1;

import javax.persistence.*;


@Entity // map to table User
public class User
{
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
    private Integer id;

    @Column(nullable = false, unique = true) // field has to be unique and not null
    private String email;

    //default constructor must be present (bean)
    public User()
    {
    }

    public User(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {this.id = id;}

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
