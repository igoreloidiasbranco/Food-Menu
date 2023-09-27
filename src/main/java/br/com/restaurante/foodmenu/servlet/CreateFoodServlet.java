package br.com.restaurante.foodmenu.servlet;

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
        System.out.println(foodName);
        req.getRequestDispatcher("index.html").forward(req, resp);
    }
}
