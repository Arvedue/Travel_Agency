package org.example.services;

import org.example.entities.Country;

import java.util.List;

public interface CountryService {
    void insert(Country country);

    Country getBy(Integer countryId);

    List<Country> getAll();

    public void addAll();
}
