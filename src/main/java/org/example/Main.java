package org.example;

/*
Используя Reflection API, напишите программу,
которая выводит на экран все методы класса String.
 */


import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        ShowMethod(String.class);

    }

    private static <T> void ShowMethod(Class<T> clazz) {
        Method[] methods=clazz.getDeclaredMethods();
        System.out.printf("Methods of Class %s:\n", clazz.getName());
        for (Method method: methods){
            System.out.println( method);
        }

    }

}
