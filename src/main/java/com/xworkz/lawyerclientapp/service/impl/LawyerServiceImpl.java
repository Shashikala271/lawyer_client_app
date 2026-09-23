package com.xworkz.lawyerclientapp.service.impl;

import com.xworkz.lawyerclientapp.dao.LawyerDao;
import com.xworkz.lawyerclientapp.dao.impl.LawyerDaoImpl;
import com.xworkz.lawyerclientapp.dto.ClientDto;
import com.xworkz.lawyerclientapp.dto.LawyerDto;
import com.xworkz.lawyerclientapp.entity.ClientEntity;
import com.xworkz.lawyerclientapp.entity.LawyerEntity;
import com.xworkz.lawyerclientapp.service.LawyerService;

public class LawyerServiceImpl implements LawyerService {


    LawyerDao lawyerDao= new LawyerDaoImpl();

    @Override
    public boolean saveAndValidateLawyer(LawyerDto lawyerDto) {

       LawyerEntity lawyerEntity = new LawyerEntity();


boolean isSaved=false;
boolean idValid=false;
boolean nameValid=false;
boolean emailValid=false;
boolean phoneValid=false;
boolean addressValid=false;


/*if (lawyerDto.getId()!=0){
    idValid=true;
}*/


if (lawyerDto.getName()!=null){
    nameValid=true;
}

if (lawyerDto.getEmail()!=null && !lawyerDto.getEmail().isEmpty()){
    emailValid=true;
}
if (lawyerDto.getPhoneNUmber()!=null && !lawyerDto.getPhoneNUmber().isEmpty()){
    phoneValid=true;
}
if (lawyerDto.getAddress()!=null && !lawyerDto.getAddress().isEmpty()){
    addressValid=true;
}
if (nameValid&&emailValid&&phoneValid&&addressValid){

  //  lawyerEntity.setId(lawyerDto.getId());
    lawyerEntity.setName(lawyerDto.getName());
    lawyerEntity.setEmail(lawyerDto.getEmail());
    lawyerEntity.setPhoneNUmber(lawyerDto.getPhoneNUmber());
    lawyerEntity.setAddress(lawyerDto.getAddress());



    ClientDto clientDto = lawyerDto.getClient();

    ClientEntity clientEntity = new ClientEntity();

    clientEntity.setId(clientDto.getId());
    clientEntity.setName(clientDto.getName());
    clientEntity.setEmail(clientDto.getEmail());
    clientEntity.setPhoneNumber(clientDto.getPhoneNumber());

    lawyerEntity.setClient(clientEntity);




    isSaved=lawyerDao.saveAndValidateLawyer(lawyerEntity);
    System.out.println(isSaved+"in service");
}

        System.out.println(lawyerDto);
        return isSaved;

    }


    @Override
    public String getClientNameByLawyerId(int lawyerId) {
        
        return lawyerDao.getClientNameByLawyerId(lawyerId);
    }
}
