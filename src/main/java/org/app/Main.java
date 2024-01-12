package org.app;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/PizzaShopDB", "postgres", "12345");

        Statement statement = connection.createStatement();
        String pizzaTypeName="Bacon";

        statement.executeUpdate("INSERT INTO  pizza_type(name,id,price) VALUES('"+pizzaTypeName+"',117,4900)");

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many types of Pizzas you are going to add?: ");

        int pizzaCount = scanner.nextInt();
        for (int i = 0; i < pizzaCount; i++) {

            System.out.println("Enter ID: ");
            int id = scanner.nextInt();

            System.out.println("Enter Name: ");
            String name = scanner.next();

            System.out.println("Enter Price: ");
            float price = scanner.nextFloat();

            System.out.printf("Pizza ID is %d , pizza name is %s  and the price is %.2f \n\n", id, name, price);

        }

    }
}