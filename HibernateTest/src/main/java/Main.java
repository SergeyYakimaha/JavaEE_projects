import config.AppContext;
import dao.CauseDAO;
import entities.Cause;
import entities.Document;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppContext.class);

        CauseDAO causeDAO = appContext.getBean(CauseDAO.class);

        Cause cause = causeDAO.get(2);

        for(Document document: cause.getDocuments()) {
            System.out.println(document);
        }

//        System.out.println(causeDAO.get(1));
//        System.out.println(causeDAO.get(2));
//        System.out.println(causeDAO.get(3));




    }
}
