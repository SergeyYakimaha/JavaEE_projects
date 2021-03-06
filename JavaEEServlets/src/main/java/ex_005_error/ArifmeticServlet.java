package ex_005_error;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Asus on 29.01.2018.
 */
public class ArifmeticServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        proccessRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        proccessRequest(req, resp);
    }

    private void proccessRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = resp.getWriter();

        try {
            String operation = req.getParameter("operation");
            System.out.println(operation);
            double value1 = Double.valueOf(req.getParameter("val1"));
            System.out.println(value1);
            double value2 = Double.valueOf(req.getParameter("val2"));
            System.out.println(value2);


            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>");
            writer.println("Operation servlet");
            writer.println("</title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.print("<h2>");
            writer.println("Operation type : " + req.getParameter("operation"));
            writer.print("</h2>");
            writer.print("<p1>");

            switch (operation) {
                case "add": writer.print(value1 + " + " + value2 + " = " + (value1+value2));
                     break;
                case "sub": writer.print(value1 + " - " + value2 + " = " + (value1-value2));
                    break;
                case "mult": writer.print(value1 + " * " + value2 + " = " + (value1*value2));
                    break;
                case "div": writer.print(value1 + " / " + value2 + " = " + (value1/value2));
                    break;
                default: throw new Exception();
            }
            writer.print("</p1>");

        }  catch (Exception e) {
            resp.sendError(HttpServletResponse.SC_CONFLICT);
            e.printStackTrace();
        } finally {
            writer.println("</body");
            writer.println("</html>");
            writer.close();
        }

    }

}
