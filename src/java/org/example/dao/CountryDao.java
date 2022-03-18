package org.example.dao;

import org.example.entities.Country;

import java.util.List;

public interface CountryDao {
    void insert(Country country);

    Country getBy(Integer countryId);

    List<Country> getAll();
}
