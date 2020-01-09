package app.servlets;

import app.entites.Animal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

//@WebServlet("/listParams")
public class ListParamsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Enumeration<String> configParamNames = getServletConfig().getInitParameterNames();

        System.out.println("ServletConfig init params:");
        while (configParamNames.hasMoreElements()) {
            String paramName = configParamNames.nextElement();
            System.out.println(paramName + " = " + getServletConfig().getInitParameter(paramName));
        }

        Enumeration<String> parameterNames = req.getParameterNames();

        System.out.println("Parameters:");
        while (parameterNames.hasMoreElements()) {
            String paramName = parameterNames.nextElement();
            System.out.println(paramName + " = " + req.getParameter(paramName));
        }

        Enumeration<String> contextParams = getServletContext().getInitParameterNames();

        System.out.println("ServletContext init params:");
        while (contextParams.hasMoreElements()) {
            String contextParamName = contextParams.nextElement();
            System.out.println(contextParamName + " = " + getServletContext().getInitParameter(contextParamName));
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/listAttributes.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
