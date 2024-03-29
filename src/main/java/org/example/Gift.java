/*package org.example;

import java.util.Random;

public class Gift {

    public static void main(String[] args) {
        // Создаем массив размером 20 для хранения объектов Product
        Product[] products = new Product[20];

        // Заполняем массив случайными значениями для каждого продукта
        for (int i = 0; i < products.length; i++) {
            String name = generateRandomName();
            double price = generateRandomPrice();
            int weight = generateRandomWeight();

            // Создаем новый объект Product и помещаем его в массив
            products[i] = new Product(name, price, weight);
        }

        // Выводим информацию о каждом продукте в массиве
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Генерация случайного названия продукта
    public static String generateRandomName() {
        String[] names = {"Яблоко", "Банан", "Апельсин", "Груша", "Виноград", "Ананас", "Мандарин", "Киви", "Персик", "Арбуз", "Мармелад", "Конфеты", "Шоколад", "Печенье", "Зефир", "Орехи"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    // Генерация случайной цены (от 10 до 1000 рублей)
    public static double generateRandomPrice() {
        return Math.round((10 + (990 * Math.random())) * 100.0) / 100.0;
    }

    // Генерация случайного веса (от 50 до 500 грамм)
    public static int generateRandomWeight() {
        return new Random().nextInt(451) + 50;
    }

    // Создаем новый массив размером 3 элемента
    Product[] newArray = new Product[3];

    // Копируем первые три элемента из массива products в новый массив newArray
        System.arraycopy(products, 0, newArray, 0, 3);

    // Выводим информацию о каждом продукте в новом массиве
        System.out.println("Новый массив из 3 элементов:");
        for (Product product : newArray) {
        System.out.println(product);
    }

    // Подсчитываем общую цену и общий вес нового массива
    double totalCost = 0;
    int totalWeight = 0;
        for (Product product : newArray) {
        totalCost += product.getPrice();
        totalWeight += product.getWeight();
    }

    // Выводим общую цену и общий вес нового массива
        System.out.println("Общая цена нового массива: " + totalCost + " руб.");
        System.out.println("Общий вес нового массива: " + totalWeight + " г");
}
}




// Класс для представления продукта
class Product {
    private String name;
    private double price;
    private int weight;

    // Конструктор для создания объекта Product
    public Product(String name, double price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    // Переопределение метода toString для вывода информации о продукте
    @Override
    public String toString() {
        return "Продукт: " + name + ", Цена: " + price + " руб., Вес: " + weight + " г";
    }


}
*/