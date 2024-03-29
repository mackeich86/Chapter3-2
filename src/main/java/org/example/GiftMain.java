package org.example;

import org.example.sweets.Cakes;
import org.example.sweets.Candies;
import org.example.sweets.Cart;
import org.example.sweets.Fruits;

import java.util.Random;

public class GiftMain {
    public static void main(String[] args) {
        Fruits fruit11 = new Fruits(generateRandomFruit(), generateRandomPrice(), generateRandomWeight(), "Сочный");
        Fruits fruit1 = new Fruits(generateRandomFruit(), generateRandomPrice(), generateRandomWeight(), "Сахарный");
        Cakes cake1 = new Cakes(generateRandomCake(), generateRandomPrice(), generateRandomWeight(), "Холодный");
        Candies candies1 = new Candies(generateRandomCandies(), generateRandomPrice(), generateRandomWeight(), "Шоколадный");
        Fruits fruit2 = new Fruits(generateRandomFruit(), generateRandomPrice(), generateRandomWeight(), "Сладкий");
        Cakes cake2 = new Cakes(generateRandomCake(), generateRandomPrice(), generateRandomWeight(), "Холодный");
        Candies candies2 = new Candies(generateRandomCandies(), generateRandomPrice(), generateRandomWeight(), "Шоколадный");
        Fruits fruit3 = new Fruits(generateRandomFruit(), generateRandomPrice(), generateRandomWeight(), "Нежный");
        Cakes cake3 = new Cakes(generateRandomCake(), generateRandomPrice(), generateRandomWeight(), "Холодный");
        Candies candies3 = new Candies(generateRandomCandies(), generateRandomPrice(), generateRandomWeight(), "Желатиновый");
        Fruits fruit4 = new Fruits(generateRandomFruit(), generateRandomPrice(), generateRandomWeight(), "Ароматный");
        Cakes cake4 = new Cakes(generateRandomCake(), generateRandomPrice(), generateRandomWeight(), "Холодный");
        Candies candies4 = new Candies(generateRandomCandies(), generateRandomPrice(), generateRandomWeight(), "Зефирный");
        Fruits fruit5 = new Fruits(generateRandomFruit(), generateRandomPrice(), generateRandomWeight(), "Сладкий");
        Cakes cake5 = new Cakes(generateRandomCake(), generateRandomPrice(), generateRandomWeight(), "Холодный");
        Candies candies5 = new Candies(generateRandomCandies(), generateRandomPrice(), generateRandomWeight(), "Мармеладный");
        Fruits fruit6 = new Fruits(generateRandomFruit(), generateRandomPrice(), generateRandomWeight(), "Сладкий");
        Cakes cake6 = new Cakes(generateRandomCake(), generateRandomPrice(), generateRandomWeight(), "Холодный");
        Candies candies6 = new Candies(generateRandomCandies(), generateRandomPrice(), generateRandomWeight(), "Ореховый");
        Fruits fruit7 = new Fruits(generateRandomFruit(), generateRandomPrice(), generateRandomWeight(), "Сладкий");
        Cakes cake7 = new Cakes(generateRandomCake(), generateRandomPrice(), generateRandomWeight(), "Холодный");
        Candies candies7 = new Candies(generateRandomCandies(), generateRandomPrice(), generateRandomWeight(), "Карамель");
        Fruits fruit8 = new Fruits(generateRandomFruit(), generateRandomPrice(), generateRandomWeight(), "Сладкий");
        Cakes cake8 = new Cakes(generateRandomCake(), generateRandomPrice(), generateRandomWeight(), "Холодный");
        Candies candies8 = new Candies(generateRandomCandies(), generateRandomPrice(), generateRandomWeight(), "Шоколадный");
        Cart[] box = {fruit1, cake1, candies1, fruit2, cake2, candies2, fruit3, cake3, candies3, fruit4, cake4, candies4, fruit5, cake5, candies5, fruit6, cake6, candies6, fruit7, cake7, candies7, fruit8, cake8, candies8, fruit11};
        for (Cart someCart : box) {
            System.out.println(someCart.toString());
        }

        // Создайте новый массив для хранения трех случайно выбранных элементов
        Cart[] randomArray = new Cart[3];

        // Создайте генератор случайных чисел
        Random random = new Random();

        // Случайным образом выберите три элемента из исходного массива
        for (int i = 0; i < 3; i++) {
            // Сгенерировать случайный индекс
            int randomIndex = random.nextInt(box.length);
            // Добавьте элементы соответствующего индекса в новый массив
            randomArray[i] = box[randomIndex];
        }

        // Выведите элементы в новом массиве
        for (Cart someCart : randomArray) {
            System.out.println("\nСобираем подарок из доступных продуктов:\n" + someCart.toString());
        }
        // Подсчитываем общую цену и общий вес нового массива

        double totalCost = 0;
        int totalWeight = 0;
        for (Cart someCart : randomArray) {
            totalCost += someCart.getPrice();
            totalWeight += someCart.getWeight();
        }

        // Выводим общую цену и общий вес нового массива
        System.out.println("\nОбщая цена подарка: " + totalCost + " руб.");
        System.out.println("Общий вес подарка: " + totalWeight + " г");
    }

        //---------------------------------------------------------------------------------------------------------------------------
        // Создаем массив размером 20 для хранения объектов Product
        /*Product[] products = new Product[20];

        // Заполняем массив случайными значениями для каждого продукта
        for (int i = 0; i < products.length; i++) {
            String name = generateRandomFruit() + " - " + i;
            double price = generateRandomPrice();
            int weight = generateRandomWeight();

            // Создаем новый объект Product и помещаем его в массив
            products[i] = new Product(name, price, weight);
        }

        // Выводим информацию о каждом продукте в массиве
        for (Product product : products) {
            System.out.println(product);
        }*/
        //------------------------------------------------------------------------------------------------------------------------------
        // Создаем новый массив размером 3 элемента
        /*Random random = new Random();
        int randomStartPosition = random.nextInt(products.length - 3 + 1); // чтобы оставить место для трех элементов
        Product[] newArray = new Product[3];
                /*for (int i = 0; i < 3; i++) {
        int randomIndex = random.nextInt(Product.length); // выбираем случайный индекс из исходного массива
        newArray[i] = Product[randomIndex]; // берем элемент с соответствующим индексом из исходного массива

        // Копируем первые три элемента из массива products в новый массив newArray
        System.arraycopy(products, randomStartPosition, newArray, 0, 3);

        // Выводим информацию о каждом продукте в новом массиве
        System.out.println("\nСобираем подарок из доступных продуктов:");
        for (Product product : newArray) {
            System.out.println(product);
        }*/
        //------------------------------------------------------------------------------------------------------------
        // Формируем новый массив из трех случайных элементов
        /*Product[] randomProducts = new Product[3];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int randomIndex = random.nextInt(product.length);
            randomProducts[i] = product[randomIndex];
        }

        // Выводим информацию о выбранных продуктах
        System.out.println("\nСобираем подарок из доступных продуктов:");
        for (Product product : randomProducts) {
            System.out.println(product);
        }

        // Подсчитываем общую цену и общий вес нового массива
        double totalCost = 0;
        int totalWeight = 0;
        for (Product product : randomProducts) {
            totalCost += product.getPrice();
            totalWeight += product.getWeight();
        }

        // Выводим общую цену и общий вес нового массива
        System.out.println("\nОбщая цена подарка: " + totalCost + " руб.");
        System.out.println("Общий вес подарка: " + totalWeight + " г");
    }*/
        //----------------------------------------------------------------------------------------------------------------------------------
    /*public static int[] generateRandomArray(int[] Product, int newSize) {
    Random random = new Random();
    int[] newArray = new int[3];
            for (int i = 0; i < 3; i++) {
        int randomIndex = random.nextInt(Product.length); // выбираем случайный индекс из исходного массива
        newArray[i] = Product[randomIndex]; // берем элемент с соответствующим индексом из исходного массива
    }
            return newArray;

        // Подсчитываем общую цену и общий вес нового массива
        double totalCost = 0;
        int totalWeight = 0;
        for (Product product : newArray) {
            totalCost += product.getPrice();
            totalWeight += product.getWeight();
        }

        // Выводим общую цену и общий вес нового массива
        System.out.println("\nОбщая цена подарка: " + totalCost + " руб.");
        System.out.println("Общий вес подарка: " + totalWeight + " г");
    }*/
        //-----------------------------------------------------------------------------------------------------------------------------------
        // Генерация случайного веса (от 50 до 5000 грамм)
        public static int generateRandomWeight () {
            return new Random().nextInt(4951) + 50;
        }

        // Генерация случайной цены (от 10 до 1000 рублей)
        public static double generateRandomPrice () {
            return Math.round((10 + (990 * Math.random())) * 100.0) / 100.0;
        }
        // Генерация случайного названия продукта
        public static String generateRandomFruit () {
            String[] names = {"Яблоко", "Банан", "Апельсин", "Груша", "Виноград", "Ананас", "Мандарин", "Киви", "Персик"};
            Random random = new Random();
            return names[random.nextInt(names.length)];
        }
        public static String generateRandomCake () {
            String[] names = {"Лимонник", "Наполеон", "Министерский", "Шоколадный", "Мороженое", "Графские развалины", "Красный бархат"};
            Random random = new Random();
            return names[random.nextInt(names.length)];
        }
        public static String generateRandomCandies () {
            String[] names = {"Бешеная пчелка", "Белочка", "Гулливер", "Сникерс", "Марс", "Натс", "Баунти", "Мармелад", "Конфеты"};
            Random random = new Random();
            return names[random.nextInt(names.length)];
        }

    //---------------------------------------------------------------------------------------------------------------------------
    static class Product {
        public double getPrice() {
            return price;
        }

        public int getWeight() {
            return weight;
        }

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
}
