package com.servlets;


import com.model.ToysRoom;
import com.services.Sorts;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class SortByPriceServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ToysRoom toysRoom =ToysRoom.getInstance();
        Sorts sort = new Sorts();
        sort.sortByCost(toysRoom.getToyList());

        req.setAttribute("room",toysRoom.getToyList());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/main.jsp");
        requestDispatcher.forward(req, resp);
    }
}