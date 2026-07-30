package com.employee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.employee.entity.Address;

public class AddressDAO {

    Configuration configuration = new Configuration().configure();
    SessionFactory sessionFactory = configuration.buildSessionFactory();

    public void saveAddress(Address address) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(address);

        transaction.commit();
        session.close();

        System.out.println("Address Saved Successfully");
    }

    public Address getAddress(int id) {

        Session session = sessionFactory.openSession();

        Address address = session.get(Address.class, id);

        session.close();

        return address;
    }

    public void updateAddress(Address address) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.merge(address);

        transaction.commit();
        session.close();

        System.out.println("Address Updated Successfully");
    }

    public void deleteAddress(int id) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Address address = session.get(Address.class, id);

        if (address != null) {
            session.remove(address);
            System.out.println("Address Deleted Successfully");
        } else {
            System.out.println("Address Not Found");
        }

        transaction.commit();
        session.close();
    }

    public List<Address> getAllAddresses() {

        Session session = sessionFactory.openSession();

        List<Address> addresses = session.createQuery("from Address", Address.class).list();

        session.close();

        return addresses;
    }
}