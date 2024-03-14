package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1, Оранская Маргарита Анатольевна, РИБО-05-22");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя магазина");
        String name = scan.nextLine();
        Shop shop = new Shop(name);
        System.out.println(shop);
        Revizor revizor = new Revizor();
        revizor.closeStore(shop);
        System.out.println(shop);
        revizor.rebrand(shop);
        System.out.println(shop);

    }
}