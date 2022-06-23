package com.poly.models;

public class User {

    private String nom,prenom,password,email ;
    private int cin,age,idUser;

    public String getNom() {
        return nom;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getCin() {
        return cin;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", cin=" + cin +
                ", age=" + age +
                ", idUser=" + idUser +
                '}';
    }
}
