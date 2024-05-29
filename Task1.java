package org.example.AlfaJava;

import java.util.Scanner;

//Напишите программу на Java, которая запрашивает у пользователя два числа и выводит их сумму.
public class Task1 {
    public int sumNumbers() {
        int first, second;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number.");
            first = sc.nextInt();

            System.out.println("Enter second number.");
            second = sc.nextInt();
        }

        return first + second;
    }

    public static void main(String[] args) {
        System.out.println("result: " +  new Task1().sumNumbers());
    }
}
