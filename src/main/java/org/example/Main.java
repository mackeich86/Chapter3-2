/*package org.example;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Создаем массив размером 20
        int[] array = new int[20];

        // Заполняем массив случайными числами от -10 до 10
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10; // Генерация чисел от -10 до 10
        }
        // Находим максимальный отрицательный элемент
        int maxNegative = Integer.MIN_VALUE;
        for (int num : array) {
            if (num < 0 && num > maxNegative) {
                maxNegative = num;
            }
        }

        // Выводим максимальный отрицательный элемент в консоль
        System.out.println("Максимальный отрицательный элемент: " + maxNegative);

        // Находим минимальный положительный элемент
        int minPositive = Integer.MAX_VALUE;
        for (int num : array) {
            if (num > 0 && num < minPositive) {
                minPositive = num;
            }
        }

        // Выводим минимальный положительный элемент в консоль
        System.out.println("Минимальный положительный элемент: " + minPositive);
    }
}
*/