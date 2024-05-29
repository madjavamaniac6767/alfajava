package org.example.AlfaJava;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Напишите программу, которая запрашивает у пользователя целое число.
* Обработайте исключение, если пользователь вводит не число (например, текст),
* и выведите сообщение об этом
* */
public class Task5 {
    public static void main(String[] args) {
        new Task5().typeNumberOrWrongType();
    }

    public void typeNumberOrWrongType() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число.");
            int number = sc.nextInt();
            System.out.println("Введенное число: " + number);
        } catch (InputMismatchException ex) {
            System.out.println("Вы ввели не целое число, а иной тип данных");
        }
    }
}
