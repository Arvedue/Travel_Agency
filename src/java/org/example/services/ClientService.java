package org.example.services;

import org.example.entities.Client;
import org.example.entities.Employee;

import java.util.List;

public interface ClientService {
    void delete(Integer clientNumber);

    void insert(Client client);

    Client getBy(Integer clientNumber);

    List getAllClients();

    void update(Client client);
}
