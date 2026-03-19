package com.example;

/**
 * Простое приложение Hello World
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println(getHelloMessage());
    }
    
    /**
     * Возвращает приветственное сообщение
     * @return строка с приветствием
     */
    public static String getHelloMessage() {
        return "Hello, World!";
    }
    
    /**
     * Возвращает персонализированное приветствие
     * @param name имя пользователя
     * @return приветствие с именем
     */
    public static String getPersonalizedMessage(String name) {
        if (name == null || name.isEmpty()) {
            return getHelloMessage();
        }
        return "Hello, " + name + "!";
    }
}
