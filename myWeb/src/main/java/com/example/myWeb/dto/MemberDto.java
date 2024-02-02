package com.example.myWeb.dto;

public class MemberDto {

    private String Id;
    private String pw;
    private String name;
    private String role;


    public MemberDto() {
    }

    public MemberDto(String id, String pw, String name, String role) {
        Id = id;
        this.pw = pw;
        this.name = name;
        this.role = role;
    }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "MemberDto{" +
                "Id='" + Id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
