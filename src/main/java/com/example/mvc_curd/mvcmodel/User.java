package com.example.mvc_curd.mvcmodel;

import javax.persistence.*;

@Entity
public class User {

    @Column
    String name;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;

    public User(String name, long id) {
        this.name = name;
        this.id = id;
    }
    public User(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
