package com.itvdn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAge(10);
        animal.setName("Ben");
        animal.setTail(true);

        Animal animal1 = new Animal();
        animal1.setAge(20);
        animal1.setName("Jon");
        animal1.setTail(false);

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(animal);
        session.save(animal1);
        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
