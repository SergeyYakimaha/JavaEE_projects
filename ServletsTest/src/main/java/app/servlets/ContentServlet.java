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
import java.io.PrintWriter;

@WebServlet("/content")
public class ContentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>Content page</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<h2 style=\"color: cornflowerblue\">Main content</h2>");
        printWriter.println("</body>");
        printWriter.println("</head>");
        printWriter.println("</html>");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/jsp/Content.jsp");
        requestDispatcher.forward(req, resp);

        String s = req.getSession().getId();
    }
}
