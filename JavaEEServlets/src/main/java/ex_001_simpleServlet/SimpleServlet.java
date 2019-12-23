package ex_001_simpleServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Asus on 29.01.2018.
 */
public class SimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();


        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>");
        writer.println("Hello World!");
        writer.println("</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>");
        writer.println("Hello World!");
        writer.println("</h1>");
        writer.println("</body");
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

}
