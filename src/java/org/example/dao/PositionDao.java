package org.example.dao;

import org.example.entities.Position;

import java.util.List;

public interface PositionDao {
    void insert(Position position);

    Position getBy(Integer positionId);

    List getAll();
}
