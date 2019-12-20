package app;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Application {

    public static void main(String[] args) throws IOException {
        Configuration configuration = new Configuration();
        Properties properties = new Properties();

        properties.load(Application.class.getClassLoader().getResourceAsStream("hibernate.properties"));

        configuration.setProperties(properties);
        configuration.addResource("User.hbm.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();


    }
}
