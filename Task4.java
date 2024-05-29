package org.example.AlfaJava;

import java.util.List;

/*
* Создайте список (List) строковых значений и добавьте в него несколько элементов.
* Затем напишите код, который перебирает элементы списка и выводит на экран только те строки,
* которые начинаются с буквы "а" (или другой заданной буквы)
*/
public class Task4 {
    public static void main(String[] args) {
        new Task4().hunting('ж');
    }
    public void hunting(char ch) {
        List<String> list = List.of("Каждый", "охотник", "желает", "знать", "где",
                                    "сидит", "фазан", "и", "налит", "стакан");

        list.stream()
            .filter(word -> word.startsWith(String.valueOf(ch)))
            .forEach(System.out::println);
    }
}
