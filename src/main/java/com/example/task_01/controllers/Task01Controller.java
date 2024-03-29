package com.example.task_01.controllers;


import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class Task01Controller {

    @GetMapping
    public String newGreeting(@RequestParam(value = "timeOfDay", defaultValue = "Day") String timeOfDay){
        Greeting greet = new Greeting("Howard", timeOfDay);
        return "Good" + " " + timeOfDay + " " + greet.getName() + "!";
    }

    // ORIGINAL MVP SOLUTION:
//    public String newGreeting(){
//        Greeting greet = new Greeting("Howard", "Morning");
//        return "Good" + " " + greet.getTimeOfDay() + " " + greet.getName() + "!";
//    }


    @GetMapping("/summer")
    public String newCelebration() {
        Celebration celebration = new Celebration();
        return "Woohoo Summer";
    }
}

