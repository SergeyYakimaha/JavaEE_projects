package ex_001_filter.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/111")
public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> listFilters = (ArrayList<String>)req.getAttribute("filters");
        HttpSession session = req.getSession();
        List<String> listFilters1 = (ArrayList<String>) session.getAttribute("filters");
        req.getRequestDispatcher("allFiltersPatch.jsp").forward(req, resp);
    }
}