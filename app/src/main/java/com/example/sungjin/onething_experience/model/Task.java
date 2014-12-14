package com.example.sungjin.onething_experience.model;


import java.util.Date;

public class Task {
    private boolean done;
    private String taskName;
    private int priority;
    private Date date;
    private boolean isDaily;
    private boolean isWeely;
    private boolean isMonthly;

    public Task(String name, Date date ) {
        this.taskName = name;
        this.done = false;
        this.date = date;
    }

    public boolean isDone() {
        return done;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getPriority() {
        return priority;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isDaily() {
        return isDaily;
    }

    public void setDaily(boolean isDaily) {
        this.isDaily = isDaily;
    }

    public boolean isWeely() {
        return isWeely;
    }

    public void setWeely(boolean isWeely) {
        this.isWeely = isWeely;
    }

    public boolean isMonthly() {
        return isMonthly;
    }

    public void setMonthly(boolean isMonthly) {
        this.isMonthly = isMonthly;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void saveToDataBase() {
    }
}
