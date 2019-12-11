package com.dao;

import com.model.entities.Dbuser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDAOImpl implements UserDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(Dbuser user) {

    }

    @Override
    public void delete(Dbuser user) {

    }

    @Override
    public void update(Dbuser user) {

    }

    @Override
    public Dbuser getByUserID(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Dbuser user = session.load(Dbuser.class, id);
        session.getTransaction().commit();
        return user;
    }
}
