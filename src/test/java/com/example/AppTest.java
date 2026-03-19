package com.example;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Тесты для приложения Hello World
 */
public class AppTest {
    
    private App app;
    
    @Before
    public void setUp() {
        // Подготовка перед каждым тестом
        app = new App();
        System.out.println("Запуск теста...");
    }
    
    @After
    public void tearDown() {
        // Очистка после каждого теста
        System.out.println("Тест завершен");
    }
    
    @Test
    public void testGetHelloMessage() {
        // Проверяем, что метод возвращает правильное сообщение
        String expected = "Hello, World!";
        String actual = App.getHelloMessage();
        assertEquals("Приветствие должно быть 'Hello, World!'", expected, actual);
    }
    
    @Test
    public void testGetPersonalizedMessage() {
        // Проверяем с именем
        String expected = "Hello, John!";
        String actual = App.getPersonalizedMessage("John");
        assertEquals("Приветствие с именем John", expected, actual);
        
        // Проверяем с другим именем
        assertEquals("Hello, Alice!", App.getPersonalizedMessage("Alice"));
    }
    
    @Test
    public void testGetPersonalizedMessageWithEmptyName() {
        // Проверяем с пустым именем - должно вернуть стандартное приветствие
        assertEquals("Hello, World!", App.getPersonalizedMessage(""));
    }
    
    @Test
    public void testGetPersonalizedMessageWithNullName() {
        // Проверяем с null - должно вернуть стандартное приветствие
        assertEquals("Hello, World!", App.getPersonalizedMessage(null));
    }
}
