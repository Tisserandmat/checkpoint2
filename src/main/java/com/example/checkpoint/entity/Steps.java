package com.example.checkpoint.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Steps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date stepDate;
    private String resume;
    @OneToMany()
    private List<Resources> resources;

    public Steps(Long id, Date stepDate, String resume) {
        this.id = id;
        this.stepDate = stepDate;
        this.resume = resume;
    }

    public Steps() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStepDate() {
        return stepDate;
    }

    public void setStepDate(Date stepDate) {
        this.stepDate = stepDate;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public List<Resources> getResources() {
        return resources;
    }

    public void setResources(List<Resources> resources) {
        this.resources = resources;
    }
}
