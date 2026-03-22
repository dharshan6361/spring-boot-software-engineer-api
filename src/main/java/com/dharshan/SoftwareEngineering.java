package com.dharshan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class SoftwareEngineering {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String techStack;

    public SoftwareEngineering() {
    }

    public SoftwareEngineering(Integer id, String name, String techStack) {
        this.id = id;
        this.name = name;
        this.techStack = techStack;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTechStack() {
        return techStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineering that = (SoftwareEngineering) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack);
    }
}
