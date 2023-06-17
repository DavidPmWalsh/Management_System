package com.daVinciCode.Management_System;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;
import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Book> checkedOutBooks;

    // Constructors, getters, and setters

    // Additional methods if needed
}