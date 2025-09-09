package com.kittenproject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Класс для работы со сложной структурой данных:
 * HashMap со значениями в виде ArrayList.
 * Демонстрирует хранение комплексной информации о котятах.
 */
public class KittensFoodStatistics {

    /**
     * ЗАДАНИЕ 8: Статистика кормления котят
     * - Создание HashMap с именами и списками данных
     * - Каждый список содержит вес и количество корма
     * - Вывод всей статистики
     */
    public static void calculateFoodStatistics() {
        System.out.println("Задание 8: Статистика кормления");

        // Создаем хеш-таблицу с данными о котятах
        HashMap<String, ArrayList<Double>> kittenWeightFood = createKittenData();

        // Выводим всю статистику
        printKittenStatistics(kittenWeightFood);
    }

    /**
     * Создает и возвращает данные о котятах
     * @return HashMap с информацией о весе и корме котят
     */
    private static HashMap<String, ArrayList<Double>> createKittenData() {
        HashMap<String, ArrayList<Double>> kittenWeightFood = new HashMap<>();

        // === ДАННЫЕ О ПУШКЕ ===
        ArrayList<Double> pushokData = new ArrayList<>();
        pushokData.add(1.62);    // вес в кг
        pushokData.add(0.095);   // корм в кг/день
        kittenWeightFood.put("Пушок", pushokData);

        // === ДАННЫЕ О СНЕЖКЕ ===
        ArrayList<Double> snezhokData = new ArrayList<>();
        snezhokData.add(1.91);
        snezhokData.add(0.092);
        kittenWeightFood.put("Снежок", snezhokData);

        // === ДАННЫЕ О ЧЕРНЫШЕ ===
        ArrayList<Double> chernyshData = new ArrayList<>();
        chernyshData.add(1.96);
        chernyshData.add(0.098);
        kittenWeightFood.put("Черныш", chernyshData);

        // === ДАННЫЕ ОБ УШАСТИКЕ ===
        ArrayList<Double> ushastikData = new ArrayList<>();
        ushastikData.add(2.02);
        ushastikData.add(0.105);
        kittenWeightFood.put("Ушастик", ushastikData);

        // === ДАННЫЕ О РЫЖИКЕ ===
        ArrayList<Double> ryzhikData = new ArrayList<>();
        ryzhikData.add(1.88);
        ryzhikData.add(0.098);
        kittenWeightFood.put("Рыжик", ryzhikData);

        return kittenWeightFood;
    }

    /**
     * Выводит статистику кормления котят
     * @param kittenWeightFood данные о котятах
     */
    private static void printKittenStatistics(HashMap<String, ArrayList<Double>> kittenWeightFood) {
        System.out.println("Статистика кормления котят:");
        System.out.println("============================");

        // Перебираем все записи в хеш-таблице
        for (String name : kittenWeightFood.keySet()) {
            ArrayList<Double> data = kittenWeightFood.get(name);
            double weight = data.get(0);
            double food = data.get(1);

            System.out.printf("%s: вес %.2f кг, корм %.3f кг/день%n",
                    name, weight, food);
        }

        System.out.println();
        System.out.println("Полная хеш-таблица: " + kittenWeightFood);
        System.out.println();
    }
}