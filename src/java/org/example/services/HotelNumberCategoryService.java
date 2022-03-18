package org.example.services;

import org.example.entities.HotelNumberCategory;

import java.util.List;

public interface HotelNumberCategoryService {
    void insert(HotelNumberCategory hotelNumberCategory);

    HotelNumberCategory getBy(Integer id);

    List getAll();

    void addAll();
}
