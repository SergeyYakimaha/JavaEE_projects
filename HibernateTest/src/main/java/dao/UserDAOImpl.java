package dao;

import entities.Cause;
import entities.Dbuser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDAOImpl implements UserDAO {
    private SessionFactory sessionFactory;

    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

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
