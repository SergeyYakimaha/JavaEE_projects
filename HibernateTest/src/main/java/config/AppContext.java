package config;

import dao.CauseDAO;
import dao.CauseDAOImpl;
import dao.UserDAO;
import dao.UserDAOImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
    @Bean
    public StandardServiceRegistry standardServiceRegistry() {
        return new StandardServiceRegistryBuilder().configure().build();
    }

    @Bean
    public SessionFactory sessionFactory() {
        return new  MetadataSources(standardServiceRegistry()).buildMetadata().buildSessionFactory();
    }

    @Bean
    public CauseDAO causeDAO() {
        return new CauseDAOImpl(sessionFactory());
    }

    @Bean
    public UserDAO userDAO() {
        return new UserDAOImpl(sessionFactory());
    }
}
