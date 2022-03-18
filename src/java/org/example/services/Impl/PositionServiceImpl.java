package org.example.services.Impl;

import org.example.dao.PositionDao;
import org.example.entities.Position;
import org.example.enums.PositionTypeEnum;
import org.example.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionDao positionDao;

    @Override
    public void insert(Position position) {
        positionDao.insert(position);
    }

    @Override
    public Position getBy(Integer positionId) {
        return positionDao.getBy(positionId);
    }

    @Override
    public List<Position> getAll() {
        return positionDao.getAll();
    }

    @Override
    public void addAllPositions() {
        if (getAll().isEmpty() || getAll() == null){
            Position position1 = new Position();
            position1.setPositionType(PositionTypeEnum.DEPUTY_DIRECTOR);
            insert(position1);

            Position position2 = new Position();
            position2.setPositionType(PositionTypeEnum.TOUR_MANAGER);
            insert(position2);

            Position position3 = new Position();
            position3.setPositionType(PositionTypeEnum.TOUR_PLANNER);
            insert(position3);

            Position position4 = new Position();
            position4.setPositionType(PositionTypeEnum.DEPUTY_MANAGER);
            insert(position4);
        }
    }
}
