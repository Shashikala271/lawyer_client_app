package com.xworkz.lawyerclientapp.service;

import com.xworkz.lawyerclientapp.dto.ClientDto;


import java.util.List;

public interface ClientService {

    boolean validateAndSaveClient(ClientDto clientDto);

    List<ClientDto> getAllClients();
}
