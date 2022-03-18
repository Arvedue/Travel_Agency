package org.example.services;

import org.example.entities.Position;

import java.util.List;

public interface PositionService {
    void insert(Position position);

    Position getBy(Integer positionId);

    List<Position> getAll();

    void addAllPositions();
}
