package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        Scanner in = new Scanner(System.in);
        int n;
        int m;
        int f;
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка: ");

        do {
            n = Integer.parseInt(in.nextLine());
            if (n <= 0) {
                System.out.println("Некорректный ввод. Размер списка это целое положительное число.");
            }
        } while (n <= 0);

        System.out.println("Введите верхнюю границу для значений: ");

        do {
            m = Integer.parseInt(in.nextLine());
            if (m <= 0) {
                System.out.println("Некорректный ввод. Верхняя граница это целое положительное число.");
            }
        } while (m <= 0);

        List<Integer> listInt = getIntegers(logger, n, m);
        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.println("Введите порог для фильтра: ");
        f = Integer.parseInt(in.nextLine());

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(listInt);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");
    }

    private static List<Integer> getIntegers(Logger logger, int n, int m) {
        logger.log("Создаем и наполняем список");

        List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            listInt.add(random.nextInt(m));
        }
        System.out.println("Вот случайный список" + listInt);
        return listInt;
    }
}