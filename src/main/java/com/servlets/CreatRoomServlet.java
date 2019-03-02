package com.servlets;

import com.model.ToysRoom;
import com.services.Sorts;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreatRoomServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ToysRoom toysRoom = ToysRoom.getInstance();
        toysRoom.fillRoom();
        Sorts sort = new Sorts();
        sort.sortByCost(toysRoom.getToyList());
        req.setAttribute("listSortedByCost",toysRoom.getToyList());

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/main.jsp");
        requestDispatcher.forward(req, resp);
    }
}
