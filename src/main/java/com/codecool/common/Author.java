package com.codecool.common;

public class Author {
    private int id;

    private String userName;

    private String email;

    public Author(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public Author() {
        this.id = -1;
        this.userName = "unknown";
        this.email = "unknown@unknown.pl";
    }

    @Override
    public String toString() {
        return "Id: " + id + " UserName: " + userName + " Email: " + email;
    }
}
