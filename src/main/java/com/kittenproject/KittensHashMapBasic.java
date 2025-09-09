package com.kittenproject;

import java.util.HashMap;

/**
 * Класс для демонстрации базовой работы с HashMap.
 * Показывает создание и объявление хеш-таблицы.
 */
public class KittensHashMapBasic {

    /**
     * ЗАДАНИЕ 7: Создание базовой хеш-таблицы
     * - Объявление HashMap с ключами String и значениями Double
     * - Создание объекта хеш-таблицы
     */
    public static void demoBasicHashMap() {
        System.out.println("Задание 7: Создание хеш-таблицы");

        // Объявляем хеш-таблицу: ключ - кличка (String), значение - вес (Double)
        HashMap<String, Double> kittenWeights;

        // Создаем объект хеш-таблицы
        kittenWeights = new HashMap<>();

        // Добавляем несколько значений для демонстрации
        kittenWeights.put("Пушок", 1.62);
        kittenWeights.put("Снежок", 1.91);

        System.out.println("Хеш-таблица создана: " + kittenWeights);
        System.out.println("Размер таблицы: " + kittenWeights.size());
        System.out.println();
    }
}