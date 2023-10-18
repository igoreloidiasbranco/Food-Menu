package br.com.restaurante.foodmenu.servlet;

import br.com.restaurante.foodmenu.dao.FoodDAO;
import br.com.restaurante.foodmenu.model.Food;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/createfood")
public class CreateFoodServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String foodName = req.getParameter("food-name");

        Food food = new Food();
        food.setName(foodName);
        new FoodDAO().createFood(food);

        req.getRequestDispatcher("index.html").forward(req, resp);
    }
}
