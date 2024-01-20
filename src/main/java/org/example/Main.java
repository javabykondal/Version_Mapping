package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Transaction tx=null;
        try {
           SessionFactory sessionFactory = HibernateUtil.getHibernateUtil();
           Session session = sessionFactory.openSession();
           tx=session.beginTransaction();
           //Customer customer=new Customer("Kondalu","kondalu@gmail.com",34566);
           Customer cu=session.load(Customer.class,1);
           cu.setEmail("kondalu98@gmail.com");
//           cu.setName("yedukondal");
           //session.save(customer);
           tx.commit();
           session.close();

       }catch (Exception ex)
       {    tx.rollback();
           ex.printStackTrace();
       }
    }
}