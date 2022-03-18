package org.example.services.Impl;

import org.example.dao.HotelNumberCategoryDao;
import org.example.entities.HotelNumberCategory;
import org.example.enums.HotelNumberCategoryEnum;
import org.example.services.HotelNumberCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HotelNumberCategoryServiceImpl implements HotelNumberCategoryService {
    @Autowired
    private HotelNumberCategoryDao hotelNumberCategoryDao;

    @Override
    public void insert(HotelNumberCategory hotelNumberCategory) {
        hotelNumberCategoryDao.insert(hotelNumberCategory);
    }

    @Override
    public HotelNumberCategory getBy(Integer id) {
        return hotelNumberCategoryDao.getBy(id);
    }

    @Override
    public List getAll() {
        return hotelNumberCategoryDao.getAll();
    }

    @Override
    public void addAll() {
        if(getAll().isEmpty() || getAll() == null){
            HotelNumberCategory hotelNumberCategory = new HotelNumberCategory();
            hotelNumberCategory.setHotelNumberCategoryEnum(HotelNumberCategoryEnum.SINGLE);
            insert(hotelNumberCategory);

            HotelNumberCategory hotelNumberCategory1 = new HotelNumberCategory();
            hotelNumberCategory1.setHotelNumberCategoryEnum(HotelNumberCategoryEnum.DOUBLE);
            insert(hotelNumberCategory1);

            HotelNumberCategory hotelNumberCategory2 = new HotelNumberCategory();
            hotelNumberCategory2.setHotelNumberCategoryEnum(HotelNumberCategoryEnum.TRIPLE);
            insert(hotelNumberCategory2);

            HotelNumberCategory hotelNumberCategory3 = new HotelNumberCategory();
            hotelNumberCategory3.setHotelNumberCategoryEnum(HotelNumberCategoryEnum.QUADRIPLE);
            insert(hotelNumberCategory3);
        }
    }
}
