package app.servlets;

import app.entites.Animal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebServlet("/setAttributes")
public class SetAttributes extends HttpServlet {

    @Override
    public void init() throws ServletException {
        //getServletContext().setAttribute("cat", new Animal("init Вася", "init Black"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //req.setAttribute("cat", new Animal("req.setAttribute", "Black"));
        req.getSession().setAttribute("cat", new Animal("req.getSession().setAttribute","White"));
        req.getServletContext().setAttribute("cat", new Animal("req.getServletContext().setAttribute", "Yellow"));
        req.getServletContext().setAttribute("test", "new");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/listAttributes.jsp");

        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }
}
