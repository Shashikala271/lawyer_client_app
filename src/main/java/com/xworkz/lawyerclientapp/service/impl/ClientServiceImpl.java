package com.xworkz.lawyerclientapp.service.impl;

import com.xworkz.lawyerclientapp.dao.ClientDao;
import com.xworkz.lawyerclientapp.dao.impl.ClientDaoImpl;
import com.xworkz.lawyerclientapp.dto.ClientDto;
import com.xworkz.lawyerclientapp.entity.ClientEntity;
import com.xworkz.lawyerclientapp.service.ClientService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientServiceImpl implements ClientService {


    ClientEntity clientEntity=new ClientEntity();
    ClientDao clientDao = new ClientDaoImpl();


    @Override
    public boolean validateAndSaveClient(ClientDto clientDto) {

        boolean isSaved=false;
      //  boolean idValid=false;
        boolean nameValid=false;
        boolean emailValid=false;
        boolean addressValid=false;
        boolean phoneValid=false;

       /* if (clientDto.id>0){
            idValid=true;
        }*/
        if (clientDto.name!=null && !clientDto.name.isEmpty()){
            nameValid=true;
        }
        if (clientDto.email!=null && !clientDto.email.isEmpty()){
            emailValid=true;
        }
        if (clientDto.address!=null && !clientDto.address.isEmpty()){

            addressValid=true;
        }
        if (clientDto.phoneNumber!=null && !clientDto.phoneNumber.isEmpty()){
            phoneValid=true;
        }

if ( nameValid&& emailValid&& addressValid&& phoneValid){

   // clientEntity.setId(clientDto.id);
    clientEntity.setName(clientDto.name);
    clientEntity.setEmail(clientDto.email);
    clientEntity.setAddress(clientDto.address);
    clientEntity.setPhoneNumber(clientDto.phoneNumber);

    isSaved=clientDao.validateAndSaveClient(clientEntity);
    System.out.println(isSaved+"   validated in service");

}

        return isSaved;
    }

    @Override
    public List<ClientDto> getAllClients() {

  List<ClientDto> clients=new ArrayList<ClientDto>();

List<ClientEntity> clientEntities=clientDao.getAllClients();


for(ClientEntity clientEntity:clientEntities){

ClientDto clientDto=new ClientDto();

clientDto.setId(clientEntity.getId());
clientDto.setName(clientEntity.getName());
clientDto.setEmail(clientEntity.getEmail());
clientDto.setAddress(clientEntity.getAddress());
clientDto.setPhoneNumber(clientEntity.getPhoneNumber());
clients.add(clientDto);

    System.out.println(clients);

}


return clients;
    }
}
