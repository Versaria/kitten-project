package com.kittenproject;

import java.util.ArrayList;

/**
 * Класс для работы со списком кличек котят.
 * Демонстрирует основные операции с ArrayList: добавление, замена, получение элементов.
 */
public class KittensListOperations {

    /**
     * Метод запускает все операции со списком кличек
     */
    public static void runAllOperations() {
        task1();
        task2();
        task3();
    }

    /**
     * ЗАДАНИЕ 1: Создание списка и добавление элементов
     * - Создать список kittenNames
     * - Добавить клички: Пушок, Ушастик, Рыжик
     * - Добавить Снежка на второе место
     * - Вывести список
     */
    private static void task1() {
        System.out.println("Задание 1: Создание списка кличек");

        // Создаем пустой список для хранения кличек (тип String)
        ArrayList<String> kittenNames = new ArrayList<>();

        // Добавляем клички по порядку методом add()
        kittenNames.add("Пушок");     // индекс 0
        kittenNames.add("Ушастик");   // индекс 1
        kittenNames.add("Рыжик");     // индекс 2

        // Добавляем "Снежок" на вторую позицию (индекс 1)
        // Все элементы после этого сдвигаются вправо
        kittenNames.add(1, "Снежок"); // теперь Ушастик -> индекс 2, Рыжик -> индекс 3

        // Выводим весь список на экран
        System.out.println("Список кличек: " + kittenNames);
        System.out.println();
    }

    /**
     * ЗАДАНИЕ 2: Замена элементов в списке
     * - Заменить "Черныш" на "Черныш-крепыш"
     * - Заменить "Снежок" на "Снежок-красавчик"
     * - Вывести измененный список
     */
    private static void task2() {
        System.out.println("Задание 2: Замена кличек");

        ArrayList<String> kittenNames = new ArrayList<>();
        kittenNames.add("Пушок");
        kittenNames.add("Ушастик");
        kittenNames.add("Рыжик");
        kittenNames.add(1, "Снежок");     // добавляем Снежка на второе место
        kittenNames.add(2, "Черныш");     // добавляем Черныша на третье место

        // Заменяем клички методом set(индекс, новое_значение)
        kittenNames.set(2, "Черныш-крепыш");      // индекс 2 - Черныш
        kittenNames.set(1, "Снежок-красавчик");   // индекс 1 - Снежок

        System.out.println("Обновленные клички: " + kittenNames);
        System.out.println();
    }

    /**
     * ЗАДАНИЕ 3: Получение элементов по индексу
     * - Добавить "Черныш" на третье место
     * - Вывести последнюю, предпоследнюю и третью кличку
     */
    private static void task3() {
        System.out.println("Задание 3: Получение элементов по индексу");

        ArrayList<String> kittenNames = new ArrayList<>();
        kittenNames.add("Пушок");
        kittenNames.add("Ушастик");
        kittenNames.add("Рыжик");
        kittenNames.add(1, "Снежок");

        // Добавляем Черныша на третье место (индекс 2)
        kittenNames.add(2, "Черныш");

        // Выводим элементы по индексам методом get()
        System.out.println("Последняя кличка: " + kittenNames.get(4));     // индекс 4
        System.out.println("Предпоследняя: " + kittenNames.get(3));        // индекс 3
        System.out.println("Третья кличка: " + kittenNames.get(2));        // индекс 2
        System.out.println();
    }
}