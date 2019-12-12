import entities.Cause;
import entities.Document;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try(SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = sessionFactory.openSession()) {
            session.beginTransaction();

//            Cause cause = session.get(Cause.class, 1);
//            String causenum = cause.getCausegnum();


            Cause cause = new Cause();
            cause.setCauseid(501);
            cause.setCausegnum("bbbbb");

            session.save(cause);
            cause.setCausegnum("501501");

            session.getTransaction().commit();
            session.close();
        }
    }
}
