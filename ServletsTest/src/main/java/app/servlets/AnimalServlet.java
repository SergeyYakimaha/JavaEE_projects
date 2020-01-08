package app.servlets;

import app.entites.Animal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/animal")
public class AnimalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("cat", new Animal("Вася", "Black"));
        req.getSession().setAttribute("dog", new Animal("Жулька","White"));
        req.getServletContext().setAttribute("fish", new Animal("Немо", "синий"));

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/animal.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
