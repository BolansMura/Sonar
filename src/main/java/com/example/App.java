package com.example;

import java.util.*;

public class App {
    
    public static void main(String[] args) {
        System.out.println(getMessage());
        
        // Бесполезная переменная (Code Smell)
        int x = 5;
        
        // Пустой блок catch (Ошибка)
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // Пустой catch - это плохо!
        }
    }
    
    public static String getMessage() {
        return "Hello, World!";
    }
    
    // Метод с длинным именем и без JavaDoc (Code Smell)
    public static String getVeryLongAndComplicatedMessageThatShouldBeSimplified() {
        return "Hello from CI/CD!";
    }
    
    // Метод с магическим числом (Code Smell)
    public static void waitForIt() {
        try {
            Thread.sleep(1000); // Магическое число 1000
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
