package com.github;

import java.util.Arrays;
import java.util.Scanner;

//The program sums two numbers entered by the user
public class Task2 {


    private int[] inputNumbers() {
        int[] inputted = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        inputted[0] = scanner.nextInt();
        System.out.println("Enter second number: ");
        inputted[1] = scanner.nextInt();
        return inputted;
    }

    private int sum(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        return sum;
    }

    @Override
    public String toString(){
        return "Sum is: " + sum(inputNumbers());
    }

}
