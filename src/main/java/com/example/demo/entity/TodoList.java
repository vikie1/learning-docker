package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TodoList {
    @Id @Column(name = "id", nullable = false) @GeneratedValue
    private Long id;
    private String name;
    private long time;
    private String duration;


    public TodoList() {
    }

    public TodoList(String name, long time, String duration) {
        this.name = name;
        this.time = time;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

    public long getTime() {
        return time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
