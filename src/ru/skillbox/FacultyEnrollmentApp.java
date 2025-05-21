package ru.skillbox;

import java.util.Scanner;

public class FacultyEnrollmentApp {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Добро пожаловать: " + name);


        System.out.println("Введите количество балллов по математике (0-100): ");
        int mathScore = scanner.nextInt();


        System.out.println("Введите количество балллов по физике (0-100): ");
        int physicsScore = scanner.nextInt();

        System.out.println("Введите количество балллов по русскому языку (0-100): ");
        int russianScore = scanner.nextInt();

        System.out.println("Какой минимальный проходной балл? (0-5) ");
        double minGpa = scanner.nextDouble();

        double scoreToGradePointRatio = 0.05;
        double mathGradePoint = mathScore * scoreToGradePointRatio;
        System.out.println("Оценка по математике: " + mathGradePoint);


        double physicsGradePoint = physicsScore * scoreToGradePointRatio;
        System.out.println("Оценка по математике: " + physicsGradePoint);

        double russianGradePoint = russianScore * scoreToGradePointRatio;
        System.out.println("Оценка по русскому: " + russianGradePoint);

        double gpa = (mathGradePoint + physicsGradePoint + russianGradePoint) / 32;
        System.out.println("Ваш средний балл: " + gpa);

        boolean hasPassedMinGpa = gpa > minGpa;

        String passMessage = hasPassedMinGpa
                ? name + ", Вы набрали минимальный проходной балл"
                : name + ", Вы не набрали минимальный проходной балл";

        System.out.println(name + ", " + passMessage);

        if (hasPassedMinGpa) {
            if (gpa >= 4.5) {
                System.out.println("Вы проходите на факультет физики и математики");
            } else if (gpa >= 4.0) {
                System.out.println("Вы проходите на приборостроительый факультет");
            } else if (gpa >= 3.5)
                System.out.println("Вы проходите на факультет Русского языка");
            else {
                System.out.println("Вы проходите на факультет философии");
            }
        }

    }
}
