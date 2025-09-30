package com.example.spring1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Set;


@Entity
public class Agents {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long agentsId;
    private String name;
    //private Set<Skills> skills;
    private boolean available;

    // Constructeurs
    public Agents() {}

    public Agents(Long agentsId, String name, Set<Skills> skills, boolean available) {
        this.agentsId = agentsId;
        this.name = name;
       // this.skills = skills;
        this.available = available;
    }

    // Getters et Setters
    public Long getAgentsId() {
        return agentsId;
    }

    public void setAgentsId(Long agentsId) {
        this.agentsId = agentsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*  public Set<Skills> getSkills() {
        return skills;
    }



    public void setSkills(Set<Skills> skills) {
        this.skills = skills;
    }

     */

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
