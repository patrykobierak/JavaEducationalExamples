package com.github;

import java.util.Calendar;
import java.util.Scanner;

//Greeting with information about the time
//Example: "Good morning Patrick! It's 9:00"
public class Task1 {


    public void printOut(){
        System.out.println(greeting(inputName()) + actualTime());
    }

    private static String inputName() {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private String greeting(String name) {
        return "Good morning " + name + "!";
    }

    private String actualTime() {
        Calendar now = Calendar.getInstance();
        return "It's " + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE);
    }
}




