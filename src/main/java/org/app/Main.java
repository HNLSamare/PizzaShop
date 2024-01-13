package org.app;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        PizzaTypeRepository repository = new PizzaTypeRepository();


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

            // creating object for PizzaType class
            PizzaType userGivenPizzaType = new PizzaType();
            userGivenPizzaType.setId(id);
            userGivenPizzaType.setName(name);
            userGivenPizzaType.setPrice(price);
            userGivenPizzaType.getPrintableDescription();
            System.out.println(userGivenPizzaType.getPrintableDescription());

            repository.addNewPizzaTypeToDb(name, id, price);


        }


    }
}