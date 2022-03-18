package org.example.services.Impl;

import org.example.dao.CountryDao;
import org.example.entities.Country;
import org.example.enums.CountriesEnum;
import org.example.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryDao countryDao;

    @Override
    public void insert(Country country) {
        countryDao.insert(country);
    }

    @Override
    public Country getBy(Integer countryId) {
        return countryDao.getBy(countryId);
    }

    @Override
    public List<Country> getAll() {
        return countryDao.getAll();
    }

    @Override
    public void addAll() {
        if (getAll().isEmpty() || getAll() == null){
            Country country = new Country();
            country.setCountriesEnum(CountriesEnum.SPAIN);
            insert(country);

            Country country1 = new Country();
            country1.setCountriesEnum(CountriesEnum.USA);
            insert(country1);

            Country country2 = new Country();
            country2.setCountriesEnum(CountriesEnum.BRASILIA);
            insert(country2);

            Country country3 = new Country();
            country3.setCountriesEnum(CountriesEnum.UNITED_KINGDOM);
            insert(country3);
        }
    }
}
