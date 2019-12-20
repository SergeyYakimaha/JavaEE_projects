package db.servlets;

import db.dao.UserDao;
import db.dao.UsersDaoJdbcTemplateImpl;
import db.models.Car;
import db.models.User;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@WebServlet("/usercars")
public class UserCarsServlet extends HttpServlet {
    private UserDao userDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<User, List<Car>> userListCarMap = new HashMap<>();

        userListCarMap = userDao.FindAllUserAllCars();

        req.setAttribute("userListCarMap", userListCarMap);
        req.getServletContext().getRequestDispatcher("/jsp/usercars.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    public void init() throws ServletException {
        Properties properties = new Properties();
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        try {
            properties.load(new FileInputStream(getServletContext().getRealPath("/WEB-INF/classes/db.properties")));
            String dbUrl = properties.getProperty("db.url");
            String dbUsername = properties.getProperty("db.username");
            String dbPassword = properties.getProperty("db.password");
            String driverClassName = properties.getProperty("db.driverClassName");

            dataSource.setUrl(dbUrl);
            dataSource.setUsername(dbUsername);
            dataSource.setPassword(dbPassword);
            dataSource.setDriverClassName(driverClassName);

            // interface во всей красе !!! :)
            //userDao = new UsersDoaJdbcImpl(dataSource);
            userDao = new UsersDaoJdbcTemplateImpl(dataSource);

        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
