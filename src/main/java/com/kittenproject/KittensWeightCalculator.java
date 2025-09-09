package com.kittenproject;

import java.util.ArrayList;

/**
 * Класс для расчета статистики веса котят.
 * Демонстрирует работу с числовыми ArrayList и циклы for/for-each.
 */
public class KittensWeightCalculator {

    /**
     * Метод запускает все расчеты веса
     */
    public static void runAllCalculations() {
        task4();
        task5();
    }

    /**
     * ЗАДАНИЕ 4: Поиск максимального веса через цикл for
     * - Создать список весов kittenWeights
     * - Найти максимальный вес с помощью цикла for
     */
    private static void task4() {
        System.out.println("Задание 4: Поиск максимального веса");

        // Создаем список для хранения весов котят (тип Double)
        ArrayList<Double> kittenWeights = new ArrayList<>();

        // Добавляем веса котят в кг
        kittenWeights.add(1.62);  // Пушок
        kittenWeights.add(1.91);  // Снежок
        kittenWeights.add(1.76);  // Черныш
        kittenWeights.add(2.02);  // Ушастик
        kittenWeights.add(1.88);  // Рыжик

        // Ищем максимальный вес с помощью enhanced for loop
        double maxWeight = 0;  // начальное значение для сравнения

        // Enhanced for loop (for-each) - более читаемый вариант
        for (Double weight : kittenWeights) { // ИСПРАВЛЕНО: enhanced for
            // Если текущий вес больше максимального, обновляем максимум
            if (weight > maxWeight) {
                maxWeight = weight;
            }
        }

        System.out.println("Максимальный вес: " + maxWeight + " кг");
        System.out.println();
    }

    /**
     * ЗАДАНИЕ 5: Расчет среднего веса через цикл for-each
     * - Рассчитать сумму весов через for-each
     * - Вычислить средний вес
     */
    private static void task5() {
        System.out.println("Задание 5: Расчет среднего веса");

        ArrayList<Double> kittenWeights = new ArrayList<>();
        kittenWeights.add(1.62);
        kittenWeights.add(1.91);
        kittenWeights.add(1.76);
        kittenWeights.add(2.02);
        kittenWeights.add(1.88);

        // Рассчитываем сумму весов с помощью цикла for-each
        double totalWeight = 0;

        // Цикл for-each: для каждого weight в kittenWeights
        for (Double weight : kittenWeights) {
            totalWeight += weight;  // добавляем вес к общей сумме
        }

        // Вычисляем средний вес: общая сумма / количество элементов
        double averageWeight = totalWeight / kittenWeights.size();

        // Форматируем вывод до двух знаков после запятой
        System.out.printf("Средний вес котёнка: %.2f кг%n", averageWeight);
        System.out.println();
    }
}