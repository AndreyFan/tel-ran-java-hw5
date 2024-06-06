package org.example.hw5_30_mai;

import java.util.Scanner;

public class Hw30mai {
    public static void main(String[] args) {
        // 1 уровень сложности: 1. Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
        //Реализует логический метод canBuy,  возвращающий boolean
        //Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
        //Отобразите строку «Я могу купить еду, это ……» и значение.
        System.out.println("-----------------------------Task 1------------------------------------");
        boolean isEdekaOpen= true;
        boolean isReweOpen = false;
        System.out.println("I can buy food , this "+ canBuy(isEdekaOpen, isReweOpen));
        System.out.println("-----------------------------Task 2------------------------------------");

        // Задание 2
        //Реализуйте программу, которая попросит пользователя ввести год и напечатать
        // этот год isLeap (високосный) или нет.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();

            if ((year % 4 == 0) && (year % 100 != 0)) {
                System.out.println("Год "+ year + " является високосным");
            }
            else if (year % 400 == 0) {
                System.out.println("Год "+ year + " является високосным");
            } else {
                System.out.println("Год " + year + " не високосный");
            }
        // Задание 3
        //Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер) и напечатает максимум из трех чисел.
        System.out.println("-----------Task 3--finding the maximum of three numbers---------------- ");
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter sekond number");
        int b = scanner.nextInt();
        System.out.println("Enter three number");
        int c = scanner.nextInt();
        int max;
        max = b > a ? b : a;
        max = max > c ? max : c;
        System.out.println("Maximum of three numbers is ..." + max );
        System.out.println("-----------additionally--------------");
        //Дополнительно:
        //Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
        // (заранее не известно сколько цифр будет в числе).
        //Например:
        //Ввод = 12345
        //Вывод = 1+2+3+4+5 = 15
        System.out.println("Enter natural number");
        int numN = scanner.nextInt();
        int sumN =0;
        while(numN != 0){
            sumN =sumN+ (numN % 10);
            numN/=10;
        }
        System.out.println("the sum of all the digits of the number is equal ot .." + sumN);

    }
    public static boolean canBuy(boolean edeka, boolean rewe){
        boolean possibility =false;
        if (edeka == true || rewe == true){
            possibility =true;
        }
        return possibility;
    }
}
