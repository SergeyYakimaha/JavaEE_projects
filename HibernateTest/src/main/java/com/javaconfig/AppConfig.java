package com.javaconfig;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.dao.CauseDAO;
import com.dao.CauseDAOImpl;
import com.dao.UserDAO;
import com.dao.UserDAOImpl;

@Configuration
@ComponentScan("com")
public class AppConfig {
    @Bean
    public StandardServiceRegistry standardServiceRegistry() {
        return new StandardServiceRegistryBuilder().configure().build();
    }

    @Bean
    public SessionFactory sessionFactory() {
        return new MetadataSources(standardServiceRegistry()).buildMetadata().buildSessionFactory();
    }

    @Bean
    public CauseDAO causeDAO() {
        return new CauseDAOImpl();
    }

    @Bean
    public UserDAO userDAO() {
        return new UserDAOImpl();
    }
}
