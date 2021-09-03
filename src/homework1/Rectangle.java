package homework1;

import java.util.Scanner;

/*
  В теле класса
создать два поля, описывающие длины сторон double side1, double side2. Создать два метода,
вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр
прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу, которая
принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и
площадь.
 */
public class Rectangle {
    //fields
    static double side1 = 0;
    static double side2 = 0;

    public static void main(String[] args){
        System.out.println("Введите первую сторону прямоугольника");
        Scanner sc = new Scanner(System.in);
        side1 = sc.nextDouble();
        System.out.println("Введите вторую сторону прямоугольника");
        Scanner sc1 = new Scanner(System.in);
        side2 = sc.nextDouble();

        System.out.println("Площадь = " + areaCalculator(side1, side2));
        System.out.println("Периметр = " + perimeterCalculator(side1, side2));
    }

    static double areaCalculator (double side1, double side2){
        return side1 * side2;
    }

    static double perimeterCalculator (double side1, double side2){
        return side1 + side2 + side1 + side2;
    }
}
