package org.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PizzaTypeRepository {
    // constructor
    public PizzaTypeRepository() {

    }

    public void addNewPizzaTypeToDb(String name,int id,float price) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/PizzaShopDB", "postgres", "12345");

            Statement statement = connection.createStatement();
            // updating the sql table
            statement.executeUpdate("INSERT INTO  pizza_type(name,id,price) VALUES('" + name + "'," + id + "," + price + ")");
        }

        catch (Exception e){

        }
    }


}











