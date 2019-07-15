package com.stupino.games.db.entities;

public class Person {
    private Integer id;
    private String s_name;
    private String s_surname;
    private String s_id;
    private String password;
    private Integer rentedGameId;
    private String studentAvatarUrl;


    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_surname() {
        return s_surname;
    }

    public void setS_surname(String s_surname) {
        this.s_surname = s_surname;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRentedGameId() {
        return rentedGameId;
    }

    public void setRentedGameId(Integer rentedGameId) {
        this.rentedGameId = rentedGameId;
    }

    public String getStudentAvatarUrl() {
        return studentAvatarUrl;
    }

    public void setStudentAvatarUrl(String studentAvatarUrl) {
        this.studentAvatarUrl = studentAvatarUrl;
    }
}
