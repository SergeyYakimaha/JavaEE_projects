package app;


import models.Cause;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        Cause cause = new Cause(4, 1, 1, 1, "N4", 2);

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();
        session.save(cause);
        session.getTransaction().commit();
        session.close();
    }

}
