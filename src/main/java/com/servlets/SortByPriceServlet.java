package com.servlets;


import com.model.ToysRoom;
import com.model.constants.Messages;
import com.services.SortUtil;
import com.services.TextPrinter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;


public class SortByPriceServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ToysRoom toysRoom =ToysRoom.getInstance();
        SortUtil sort = new SortUtil();
        TextPrinter textPrinter= new TextPrinter();
        sort.sortByCost(toysRoom.getToyList());


        req.setAttribute("typeOfSort",TextPrinter.showMessages(Messages.SORTED_BY_COST));

        req.setAttribute("list",textPrinter.printer(toysRoom.getToyList()));


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/main.jsp");
        requestDispatcher.forward(req, resp);
    }
}
