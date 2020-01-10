package app.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/content")
public class ContentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/jsp/Content.jsp");
        requestDispatcher.forward(req, resp);
        //        System.out.println(req.getSession().isNew());
//
//        if (session == null)
//            System.out.println("SessionID = null");
//        else
//            System.out.println("SessionID = " + session.getId());
    }
}
