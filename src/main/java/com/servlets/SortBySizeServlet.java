package com.servlets;

import com.model.ToysRoom;
import com.view.Messages;
import com.services.SortImpl;
import com.services.TextPrinter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SortBySizeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ToysRoom toysRoom =ToysRoom.getInstance();
        SortImpl sort = new SortImpl();
        TextPrinter textPrinter= new TextPrinter();
        sort.sortBySize(toysRoom.getToyList());



        req.setAttribute("typeOfSort",TextPrinter.showMessages("en",Messages.SORTED_BY_SIZE));


        req.setAttribute("list",textPrinter.printer(toysRoom.getToyList()));

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/main.jsp");
        requestDispatcher.forward(req, resp);

    }
}
