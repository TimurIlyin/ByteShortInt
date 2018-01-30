package com.TimIl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Math.PI); // Число Пи, с помошью библиотеки Math

        Scanner in = new Scanner(System.in);
        int value = 0;
        double Leibniz = 0;

        double Nilakant = 0;

        //Ряд Лейбница
        for (int loop = 0 ; loop < 1000000 ; loop ++) {
            Leibniz = Leibniz + ((Math.pow(-1, loop)) / ((2 * loop) + 1));
        }

        //Ряд Нилаканта
        for (int anotherLoop = 0 ; anotherLoop < 1000000 ; anotherLoop = anotherLoop + 3){
            Nilakant = 3 + (Math.pow(-1 , anotherLoop)*4/((anotherLoop+1)*(anotherLoop+2)*(anotherLoop+3)));
        }

        //Число Пи с помощью ряда Нилаканта
        System.out.println("Число Пи с помощью ряда Нилаканта: " + Nilakant);

        //Число Пи с помощью ряда Лейбница
        Leibniz = Leibniz*4;

        String LeibnizString = Double.toString(Leibniz);
        //Число Пи строкой
        System.out.println("Число Пи с помощью ряда Лейбница: " + LeibnizString);

        System.out.println("Введите число знаков после запятой, не превышающей 16 ");
        value = in.nextInt();

        String result = LeibnizString.substring(1, value + 2);
        System.out.println(result);

    }
}

