package Task_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Задача 2");
        System.out.println("-------------------");
        System.out.println("Введите максимальную сумму на покупку автомобиля (руб.): ");
        Scanner scanner = new Scanner(System.in);
        int cash = scanner.nextInt();
        Cars car1 = Cars.valueOf("Car1");
        Cars car2 = Cars.valueOf("Car2");
        Cars car3 = Cars.valueOf("Car3");
        Cars car4 = Cars.valueOf("Car4");
        Cars car5 = Cars.valueOf("Car5");
        Cars car6 = Cars.valueOf("Car6");
        Cars[] kor = {car1, car2, car3, car4, car5, car6};
        System.out.println("Автомобили, доступные к покупке: ");
        System.out.println("-----------------------------");
        Arrays.sort(kor, new Comparator<Cars>() {
            @Override
            public int compare(Cars first, Cars second) {
                if (first.getSpeed() != second.getSpeed()) {
                    return Integer.parseInt(second.getSpeed()) - Integer.parseInt(first.getSpeed());
                }
                return first.getMark().compareTo(second.getMark());
            }
        });

        for (int i = 0; i < 7; i++) {
            if (cash >= Integer.parseInt(kor[i].price)) {

                switch (kor[i].mark) {
                    case "Toyota":
                        System.out.println("Марка: " + (kor[i].mark) + " (" + MarkAndColor.Toyota.getName() + ")");
                        break;
                    case "BMW":
                        System.out.println("Марка: " + (kor[i].mark) + " (" + MarkAndColor.BMW.getName() + ")");
                        break;
                    case "Nissan":
                        System.out.println("Марка: " + (kor[i].mark) + " (" + MarkAndColor.Nissan.getName() + ")");
                        break;
                    case "Ford":
                        System.out.println("Марка: " + (kor[i].mark) + " (" + MarkAndColor.Ford.getName() + ")");
                        break;
                    case "Honda":
                        System.out.println("Марка: " + (kor[i].mark) + " (" + MarkAndColor.Honda.getName() + ")");
                        break;
                    case "VAZ":
                        System.out.println("Марка: " + (kor[i].mark) + " (" + MarkAndColor.VAZ.getName() + ")");
                        break;
                }
                System.out.println("Модель: " + (kor[i].model));
                System.out.println("Цена: " + (kor[i].price) + " руб.");
                System.out.println("Скорость: " + (kor[i].speed) + " км/ч");
                switch (kor[i].color) {
                    case "White":
                        System.out.println("Цвет: " + (kor[i].color) + " (" + MarkAndColor.White.getName() + ")");
                        break;
                    case "DarkBlue":
                        System.out.println("Цвет: " + (kor[i].color) + " (" + MarkAndColor.DarkBlue.getName() + ")");
                        break;
                    case "Blue":
                        System.out.println("Цвет: " + (kor[i].color) + " (" + MarkAndColor.Blue.getName() + ")");
                        break;
                    case "Yellow":
                        System.out.println("Цвет: " + (kor[i].color) + " (" + MarkAndColor.Yellow.getName() + ")");
                        break;
                    case "Burgundi":
                        System.out.println("Цвет: " + (kor[i].color) + " (" + MarkAndColor.Burgundi.getName() + ")");
                        break;
                    case "Orange":
                        System.out.println("Цвет: " + (kor[i].color) + " (" + MarkAndColor.Orange.getName() + ")");
                        break;
                }
                System.out.println("________________________________");
            }
        }
    }
}

