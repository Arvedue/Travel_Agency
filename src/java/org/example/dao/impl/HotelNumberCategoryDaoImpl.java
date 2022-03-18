package org.example.dao.impl;

import org.example.dao.HotelNumberCategoryDao;
import org.example.entities.HotelNumberCategory;
import org.example.entities.Position;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class HotelNumberCategoryDaoImpl implements HotelNumberCategoryDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public void insert(HotelNumberCategory hotelNumberCategory) {
        Session session = sessionFactory.getCurrentSession();
        session.save(hotelNumberCategory);
    }

    @Override
    public HotelNumberCategory getBy(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        HotelNumberCategory hotelNumberCategory = session.get(HotelNumberCategory.class, id);
        return hotelNumberCategory;
    }

    @Override
    public List getAll() {
        Session session = sessionFactory.getCurrentSession();
        List<HotelNumberCategory> hotelNumberCategories = session.createQuery("from HotelNumberCategory ").getResultList();
        return hotelNumberCategories;
    }
}
