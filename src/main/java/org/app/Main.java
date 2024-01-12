package org.app;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many types of Pizzas you are going to add?: ");

        int pizzaCount = scanner.nextInt();
        for (int i = 0; i < pizzaCount; i++) {

            System.out.println("Enter ID: ");
            int id = scanner.nextInt();

            System.out.println("Enter Name: ");
            String pizzaName = scanner.next();

            System.out.println("Enter Price: ");
            float price = scanner.nextFloat();

            System.out.printf("Pizza ID is %d , pizza name is %s  and the price is %.2f \n\n", id, pizzaName, price);

        }

    }
}