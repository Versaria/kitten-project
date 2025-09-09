package com.kittenproject;

import java.util.ArrayList;

/**
 * Класс для симуляции процесса кормления котят.
 * Демонстрирует методы работы со списками: isEmpty, size, remove, contains, clear.
 */
public class KitchenFeedingSimulator {

    /**
     * ЗАДАНИЕ 6: Симуляция кормления котят
     * - Проверка пустоты списка
     * - Добавление котят на кухню
     * - Поочередное удаление котят после кормления
     * - Очистка списка
     */
    public static void simulateFeeding() {
        System.out.println("Задание 6: Симуляция кормления");

        // Создаем список котят на кухне
        ArrayList<String> kittensInTheKitchen = new ArrayList<>();

        // Проверяем, есть ли котята на кухне (список пустой)
        System.out.println("На кухне нет котят"); // Известно, что список пустой

        // Все котята приходят на кухню
        kittensInTheKitchen.add("Пушок");
        kittensInTheKitchen.add("Снежок");
        kittensInTheKitchen.add("Черныш");
        kittensInTheKitchen.add("Ушастик");
        kittensInTheKitchen.add("Рыжик");

        // Проверяем снова после добавления
        System.out.println("Котят на кухне: " + kittensInTheKitchen.size()); // Известно, что 5 котят

        // Котята поели и уходят...

        // Удаляем Пушка по индексу (индекс 0)
        kittensInTheKitchen.remove(0);
        System.out.println("Пушок покушал и ушёл");

        // Удаляем Снежка по имени (объекту)
        kittensInTheKitchen.remove("Снежок");
        System.out.println("Снежок покушал и ушёл");

        // Проверяем, остался ли Снежок
        if (kittensInTheKitchen.contains("Снежок")) {
            System.out.println("Снежок ещё на кухне");
        } else {
            System.out.println("Снежок уже ушёл");
        }

        // Удаляем Черныша по имени
        kittensInTheKitchen.remove("Черныш");
        System.out.println("Черныш покушал и ушёл");

        // Проверяем, остался ли Черныш
        if (kittensInTheKitchen.contains("Черныш")) {
            System.out.println("Черныш ещё на кухне");
        } else {
            System.out.println("Черныш уже ушёл");
        }

        // Очищаем список от оставшихся котят
        kittensInTheKitchen.clear();
        System.out.println("Все оставшиеся котята ушли");

        // Финальная проверка
        System.out.println("На кухне нет котят - все сыты! 🍽️"); // Известно, что список пустой

        System.out.println();
    }
}