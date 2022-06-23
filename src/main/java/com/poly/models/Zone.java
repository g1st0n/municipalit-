package com.poly.models;

import java.util.List;

public class Zone {

    private long id ;
    private String name;
    List<Societe> companies;

    public Zone(long id, String name, List<Societe> companies) {
        this.id = id;
        this.name = name;
        this.companies = companies;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Societe> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Societe> companies) {
        this.companies = companies;
    }

    @Override
    public String toString() {
        return "Zone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companies=" + companies +
                '}';
    }
}
