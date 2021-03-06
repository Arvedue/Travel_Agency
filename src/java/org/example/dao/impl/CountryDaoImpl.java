package org.example.dao.impl;

import org.example.dao.CountryDao;
import org.example.entities.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CountryDaoImpl implements CountryDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public void insert(Country country) {
        Session session = sessionFactory.getCurrentSession();
        session.save(country);
    }

    @Override
    public Country getBy(Integer countryId) {
        Session session = sessionFactory.getCurrentSession();
        Country country = session.get(Country.class, countryId);
        return country;
    }

    @Override
    public List<Country> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Country").getResultList();
    }
}
