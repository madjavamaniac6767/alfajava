package org.example.AlfaJava;

import java.security.SecureRandom;

/*
* Напишите программу на Java, которая заполняет массив из 10 целых чисел,
* а затем выводит на экран только четные числа из этого массива.
* */
public class Task3 {
    public static void main(String[] args) {
        setRandom();
    }
    public static void setRandom() {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++)
            arr[i] = new SecureRandom().nextInt(20);

        for (int num : arr)
            if (num % 2 == 0) System.out.println(num);
    }
}
