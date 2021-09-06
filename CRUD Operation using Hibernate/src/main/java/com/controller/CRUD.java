package com.controller;


import com.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUD {
    public static void main(String[] args) {
        Configuration cfg= new Configuration();
        cfg.configure();
        SessionFactory factory= cfg.buildSessionFactory();
        Session session=factory.openSession();

        // Creating Product Object
        Product mobile=new Product(1,"I Phone",48000,10);

        //Creating Entry in DB ******CREATE****************
        Transaction t1=session.beginTransaction();
        session.save(mobile);
        t1.commit();

        //Retrieving from DB  *******READ*********************
        Product ret=session.load(Product.class,1);
        System.out.println(ret);

        //Updating in DB  **********UPDATE********************
        ret.setProductPrice(90000);
        Transaction t2=session.beginTransaction();
        session.update(ret);
        t2.commit();

        System.out.println(ret);

        //Deleting in DB ********DELETION**********************
        Transaction t3=session.beginTransaction();
        session.delete(ret);
        t3.commit();

        session.close();
        factory.close();
    }
}
