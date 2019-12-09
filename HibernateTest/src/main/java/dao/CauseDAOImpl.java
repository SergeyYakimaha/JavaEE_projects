package dao;

import entities.Cause;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CauseDAOImpl implements CauseDAO {
    private SessionFactory sessionFactory;

    public CauseDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void insert(int causeCount) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        for (int i = 1; i <= causeCount; i++) {
            Cause cause = new Cause();
            cause.setCauseid(i);
            cause.setOrgid(200);
            cause.setCausegnum(String.valueOf(i));
            session.save(cause);
        }
        session.getTransaction().commit();
    }

    public Cause get(int id) {
        Session session = sessionFactory.openSession();
        //session.beginTransaction();
        Cause cause = session.get(Cause.class, id);
        //session.getTransaction().commit();
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
}
