package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {

        static SessionFactory sessionFactory = null;
static {

        try {
            Configuration cf = new Configuration();
            Properties ps = new Properties();
            ps.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
            ps.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate");
            ps.put(Environment.USER, "root");
            ps.put(Environment.PASS, "kondalu309");
            ps.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
            ps.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
            ps.put(Environment.SHOW_SQL, "true");
            ps.put(Environment.HBM2DDL_AUTO, "update");
            cf.setProperties(ps);
            cf.setProperties(ps);
            cf.addAnnotatedClass(Customer.class);
            StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();
            ServiceRegistry serviceRegistry = standardServiceRegistryBuilder.applySettings(cf.getProperties()).build();
            sessionFactory = cf.buildSessionFactory(serviceRegistry);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
        public static SessionFactory getHibernateUtil()
        {

            return sessionFactory;
        }
    }

