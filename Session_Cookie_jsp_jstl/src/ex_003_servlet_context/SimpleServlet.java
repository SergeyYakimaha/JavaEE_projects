package ex_003_servlet_context;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class SimpleServlet extends HttpServlet {

    private String developerName;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        proccessRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        proccessRequest(req, resp);
    }

    private void proccessRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = resp.getWriter();

        HttpSession session = req.getSession();

        Object resSessionObj = session.getAttribute("count");
        int count = (resSessionObj == null) ? 0 : (int) resSessionObj;

        count++;
        session.setAttribute("count", count);

        Enumeration<String> allParams = req.getParameterNames();

        try {
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>");
            writer.println("second servlet");
            writer.println("</title>");
            writer.println("</head>");
            writer.println("<body>");

            int i = 1;

            while (allParams.hasMoreElements()) {
                writer.print("<p>");
                String param = allParams.nextElement();
                writer.println("param " + i + " " + param);
                writer.print("</p>");
                i++;
            }

            TestObject testObject = new TestObject("Test");
            ServletContext context = getServletContext();
            context.setAttribute("test", testObject);

            writer.print("<h1>Count requested: " + count + "</h1>");
            writer.print("<h1>Count requested: " + developerName + "</h1>");


            writer.println("</body");
            writer.println("</html>");
        } finally {
            writer.close();
        }

    }


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        developerName = config.getInitParameter("name");
    }

}
