import entities.Cause;
import entities.Document;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = sessionFactory.openSession();

            session.beginTransaction();

            for (int i = 1; i <= 100 ; i++) {
                session.save(new Cause(i, 200, "№ " + i));
            }

            for (int i = 1; i <= 300 ; i++) {
                session.save(new Document(i, 200));
            }

            session.getTransaction().commit();

            session.close();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}
