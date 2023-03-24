package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void add(Employee employee) {
        try (Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(employee);
            transaction.commit();
        }
    }

    @Override
    public Employee getById(int id) {
        return HibernateSessionFactoryUtils.getSessionFactory().openSession().get(Employee.class, id);
    }

    @Override
    public List<Employee> allEmployee() {
        try (Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession()) {
            Query<Employee> employees = session.createQuery("From Employee", Employee.class);
            return employees.list();
        }
    }

    @Override
    public void updateEmployee(Employee employee) {
        try (Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
        }

    }

    @Override
    public void deleteEmployee(Employee employee) {
        try (Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(employee);
            transaction.commit();
        }

    }
}


