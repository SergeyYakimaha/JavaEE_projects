package somePackage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Properties;

public class LibraryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            pw.println(e.getMessage());
        }

        try {
            String url = "jdbc:postgresql://localhost:5432/java_ee_db";

            Properties props = new Properties();
            props.setProperty("user","postgres");
            props.setProperty("password","yakimaha");
            Connection conn = DriverManager.getConnection(url, props);

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select title from books");

            while (rs.next()) {
                pw.println(rs.getString("title"));
            }

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            pw.println(e.getMessage());
        }

    }
}