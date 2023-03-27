package org.example;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CityDAOImpl implements CityDAO {
    @Override
    public void add(City city) {
        try (Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.merge(city);
            transaction.commit();
        }
    }

    @Override
    public City getById(int id) {
        return HibernateSessionFactoryUtils.getSessionFactory().openSession().get(City.class, id);
    }

    @Override
    public List<City> allCity() {
        try (Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession()) {
            Query<City> city = session.createQuery("SELECT u FROM City u JOIN FETCH u.employeeList", City.class);
            return city.list();
        }
    }

    @Override
    public void updateCity(City city) {
        try (Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(city);
            transaction.commit();
        }
    }

    @Override
    public void deleteCity(City city) {
        try (Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(city);
            transaction.commit();
        }
    }
}
