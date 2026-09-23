package com.xworkz.lawyerclientapp.dao;

import com.xworkz.lawyerclientapp.dto.ClientDto;
import com.xworkz.lawyerclientapp.entity.ClientEntity;

import java.util.List;

public interface ClientDao {

    boolean validateAndSaveClient(ClientEntity clientEntity);

    public List<ClientEntity> getAllClients();

}
