import somePackage.Cart;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");

//        Cart cart = (Cart) request.getSession().getAttribute("cart");
//
//        if (cart == null) {
//            cart = new Cart();
//            cart.setName(request.getParameter("name"));
//            cart.setQuantity(Integer.parseInt(request.getParameter("quantity")));
//        }
//
//        request.getSession().setAttribute("cart", cart);
//
//        getServletContext().getRequestDispatcher("/testJsp.jsp").forward(request, response);

//        PrintWriter pw = response.getWriter();
//
//        pw.println("<html>");
//        pw.println("<h1> Your count is : " + count + "</h1>");
//        pw.println("</html>");

//        response.sendRedirect("https://www.google.com/");
//        response.sendRedirect("/testJsp.jsp");

//        RequestDispatcher dispatcher = request.getRequestDispatcher("/testJsp.jsp");
//        dispatcher.forward(request, response);
    }
}
