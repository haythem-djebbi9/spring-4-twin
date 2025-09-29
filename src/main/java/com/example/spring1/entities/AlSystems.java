package com.example.spring1.entities;

import java.util.Set;

public class AlSystems {

    private Long alSystemsId;
    private String type;
    private boolean available;
    private Set<Skills> skills;

    // Constructeurs
    public AlSystems() {}

    public AlSystems(Long alSystemsId, String type, boolean available, Set<Skills> skills) {
        this.alSystemsId = alSystemsId;
        this.type = type;
        this.available = available;
        this.skills = skills;
    }

    // Getters et Setters
    public Long getAlSystemsId() {
        return alSystemsId;
    }

    public void setAlSystemsId(Long alSystemsId) {
        this.alSystemsId = alSystemsId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Set<Skills> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skills> skills) {
        this.skills = skills;
    }

}
