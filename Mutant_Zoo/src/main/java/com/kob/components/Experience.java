package com.kob.components;

import java.time.LocalTime;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="t_experience")
public class Experience {
    @Id
    private int experienceId;
    private LocalTime duration;
    private float cost;
    private boolean extra;
    private String description;

    public Experience() {
    }

    public Experience(int experienceId, LocalTime duration, float cost, boolean extra, String description) {
        this.experienceId = experienceId;
        this.duration = duration;
        this.cost = cost;
        this.extra = extra;
        this.description = description;
    }

    public int getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(int experienceId) {
        this.experienceId = experienceId;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "experienceId=" + experienceId +
                ", duration=" + duration +
                ", cost=" + cost +
                ", extra=" + extra +
                ", description='" + description + '\'' +
                '}';
    }
}
