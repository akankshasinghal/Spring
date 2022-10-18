package com.akanksha.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    String name;

    @Id
    @GeneratedValue
    Integer id;

    User()
    {
            
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User(String name,Integer id)
    {
        this.name=name;
        this.id=id;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

  

    public String  toString(User user)
    {
        return String.format("User [id=%s,name=%s]", id,name);
    }
}
