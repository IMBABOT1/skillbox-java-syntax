package ru.skillbox;


import java.util.Scanner;

public class FacultyEnrollmentApp {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char answer1;
        char answer2;
        char answer3;


        System.out.println("Вы согласны, что программирование - это круто? [Y/n]");
        answer1 = scanner.nextLine().charAt(0);
        System.out.println("Будете изучать программирование дальше? [Y/n]");
        answer2 = scanner.nextLine().charAt(0);
        System.out.println("Собираетесь изменить свою жизнь? [Y/n]");
        answer3 = scanner.nextLine().charAt(0);


        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
    }
}
