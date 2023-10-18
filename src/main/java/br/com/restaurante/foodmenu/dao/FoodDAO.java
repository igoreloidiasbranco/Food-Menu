package br.com.restaurante.foodmenu.dao;

import br.com.restaurante.foodmenu.model.Food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FoodDAO {

    public void createFood(Food food) {

        String sql = "INSERT INTO FOOD (NAME) VALUES (?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, food.getName());
            preparedStatement.execute();

            System.out.println("success in insert food");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");

        }

    }
    }

