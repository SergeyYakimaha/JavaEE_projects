package com.dao;

import com.model.entities.Cause;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CauseDAOImpl implements CauseDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Cause> getAllCause() {
        List<Cause> causeList = new ArrayList<>();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String sql = "From " + Cause.class.getSimpleName() + " ORDER BY causeid";
        causeList = session.createQuery(sql).list();
        session.getTransaction().commit();
        return causeList;
    }

    public void insert(int causeCount) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        for (int i = 1; i <= causeCount; i++) {
            Cause cause = new Cause();
            cause.setCausegnum(String.valueOf(i));
            session.save(cause);
        }
        session.getTransaction().commit();
    }

    public Cause get(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Cause cause = session.load(Cause.class, id);
        session.getTransaction().commit();
        return cause;
    }

    public void insert(Cause cause) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(cause);
        session.getTransaction().commit();
    }

    public void delete(Cause cause) {

    }

    public void update(Cause cause) {

    }

    @Override
    public Cause getCauseByID(int id) {
        return null;
    }

    @Override
    public Cause getCauseByCauseGNum(String causegnum) {
        return null;
    }
}
