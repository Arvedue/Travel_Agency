package org.example.dao;

import org.example.entities.HotelNumberCategory;

import java.util.List;

public interface HotelNumberCategoryDao {
    void insert(HotelNumberCategory hotelNumberCategory);

    HotelNumberCategory getBy(Integer id);

    List getAll();
}
