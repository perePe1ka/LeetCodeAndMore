package org.example.controller;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private int age;

    @Column
    private String fullName;

    @Column
    private LocalDate birhtday;

    public User(UUID id, int age, String fullName, LocalDate birhtday) {
        this.id = id;
        this.age = age;
        this.fullName = fullName;
        this.birhtday = birhtday;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirhtday() {
        return birhtday;
    }

    public void setBirhtday(LocalDate birhtday) {
        this.birhtday = birhtday;
    }
}
