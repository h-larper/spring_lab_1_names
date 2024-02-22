package com.example.task_01.models;

public class Greeting {

    private String name;
    private String timeOfDay;

    public Greeting() {}

    public Greeting (String inputName, String inputTimeOfDay) {
        this.name = inputName;
        this.timeOfDay = inputTimeOfDay;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return this.timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

}
