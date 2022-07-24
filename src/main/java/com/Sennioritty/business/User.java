package com.Sennioritty.business;

public class User {

    private Long id;
    private String name;
    private String email;

    public User(String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User(Long s, String name, String email) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return this.id + "Username= "+this.name + " Email= "+this.email;
    }


}
