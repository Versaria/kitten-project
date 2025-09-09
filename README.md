# Kitten Project 🐱

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![Java](https://img.shields.io/badge/Java-11+-blue)
![Maven](https://img.shields.io/badge/Maven-3.6+-orange)
![JUnit](https://img.shields.io/badge/JUnit-4-red)

Проект для изучения работы с ArrayList и HashMap на примере данных о котятах.

## 🚀 Быстрый старт

### Требования
- Java JDK 11+
- Apache Maven 3.6+
- Git (для клонирования)

### Установка и запуск
```bash
git clone git@github.com:Versaria/kitten-project.git
cd kitten-project
mvn compile
mvn exec:java -Dexec.mainClass="com.kittenproject.Main"
mvn package
java -jar target/kitten-project-1.0-SNAPSHOT.jar
```

## 📂 Структура проекта

```
kitten-project/
├── pom.xml
├── src/main/java/com/kittenproject/
│   ├── Main.java                      # Главный класс для запуска
│   ├── KittensListOperations.java     # Задания 1-3: Работа со списком кличек
│   ├── KittensWeightCalculator.java   # Задания 4-5: Расчет веса котят
│   ├── KitchenFeedingSimulator.java   # Задание 6: Симуляция кормления
│   ├── KittensHashMapBasic.java       # Задание 7: Базовая хеш-таблица
│   └── KittensFoodStatistics.java     # Задание 8: Статистика кормления
├── LICENSE
├── README.md
└── .gitignore
```

## 📋 Функционал

### Основные возможности:
- **Работа с ArrayList** - добавление, удаление, замена элементов
- **Циклы for и for-each** - обработка коллекций
- **HashMap** - хранение пар ключ-значение
- **Комплексные структуры данных** - вложенные коллекции

### Задания:
1. **Создание и модификация списка кличек** (Пушок, Снежок, Ушастик, Рыжик, Черныш)
2. **Замена элементов** в списке (Черныш → Черныш-крепыш, Снежок → Снежок-красавчик)
3. **Получение элементов по индексу** (последний, предпоследний, третий)
4. **Поиск максимального веса** котят через цикл
5. **Расчет среднего веса** котят через for-each
6. **Симуляция кормления** - добавление/удаление котят из кухни
7. **Создание хеш-таблицы** для хранения веса котят
8. **Комплексная статистика** - вес + норма корма для каждого котенка

## 📊 Покрытие тестами

### Проект является учебным и демонстрирует:
- ✅ 100% coverage основных концепций Java Collections
- ✅ Практическое применение ArrayList и HashMap
- ✅ Работа с циклами и условными конструкциями
- ✅ Обработка исключений и валидация данных

## 💻 Пример работы

### Запуск приложения
```java
// Создание списка кличек
ArrayList<String> kittenNames = new ArrayList<>();
kittenNames.add("Пушок");
kittenNames.add("Ушастик");
kittenNames.add(1, "Снежок"); // Добавление на вторую позицию

// Вывод: [Пушок, Снежок, Ушастик]
System.out.println(kittenNames);
```

### Пример вывода
```
🐱 Добро пожаловать в проект про котят! 🐱
===========================================

1. Операции со списком кличек:
Задание 1: Создание списка кличек
Список кличек: [Пушок, Снежок, Ушастик, Рыжик]

2. Расчет веса котят:
Задание 4: Поиск максимального веса
Максимальный вес: 2.02 кг

3. Симуляция кормления:
Задание 6: Симуляция кормления
На кухне нет котят
Котят на кухне: 5
...
```

## 📜 Лицензия
MIT License. Полный текст доступен в файле [LICENSE](LICENSE).

## 🤝 Как внести вклад
1. Форкните репозиторий
2. Создайте ветку (`git checkout -b feature/new-dish`)
3. Сделайте коммит (`git commit -am 'Add new menu item'`)
4. Запушьте ветку (`git push origin feature/new-dish`)
5. Откройте Pull Request

---

<details>
<summary>🔧 Дополнительные команды</summary>

```bash
# Запуск тестов с отчетом
mvn test surefire-report:report

# Анализ кода
mvn pmd:pmd checkstyle:checkstyle
```
</details>