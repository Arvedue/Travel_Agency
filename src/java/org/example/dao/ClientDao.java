package org.example.dao;

import org.example.entities.Client;

import java.util.List;

public interface ClientDao {
    void delete(Integer clientNumber);

    void insert(Client client);

    Client getBy(Integer clientNumber);

    List getAllClients();

    void update(Client client);
}
