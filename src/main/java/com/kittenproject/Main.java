package com.kittenproject;

/**
 * Главный класс приложения для запуска всех заданий про котят.
 * Этот класс демонстрирует работу с ArrayList и HashMap на примере данных о котятах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("🐱 Добро пожаловать в проект про котят! 🐱");
        System.out.println("===========================================");

        // Запуск всех заданий по порядку
        System.out.println("\n1. Операции со списком кличек:");
        KittensListOperations.runAllOperations();

        System.out.println("\n2. Расчет веса котят:");
        KittensWeightCalculator.runAllCalculations();

        System.out.println("\n3. Симуляция кормления:");
        KitchenFeedingSimulator.simulateFeeding();

        System.out.println("\n4. Базовая хеш-таблица:");
        KittensHashMapBasic.demoBasicHashMap();

        System.out.println("\n5. Статистика кормления:");
        KittensFoodStatistics.calculateFoodStatistics();

        System.out.println("\n===========================================");
        System.out.println("Все задания выполнены успешно! 🎉");
    }
}