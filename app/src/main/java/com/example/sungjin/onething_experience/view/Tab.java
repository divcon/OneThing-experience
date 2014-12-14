package com.example.sungjin.onething_experience.view;


import com.example.sungjin.onething_experience.model.Task;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tab {
    private ArrayList<Task> taskList;
    private Date Today;

    public Tab(){
        this.Today = this.getTodayDate();
        this.taskList = new ArrayList<Task>();
    }

    public abstract Date getTodayDate();
}
