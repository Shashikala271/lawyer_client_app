package com.xworkz.lawyerclientapp.service;

import com.xworkz.lawyerclientapp.dto.ClientDto;
import com.xworkz.lawyerclientapp.dto.LawyerDto;

public interface LawyerService {

public  boolean saveAndValidateLawyer(LawyerDto lawyerDto);

public String getClientNameByLawyerId(int lawyerId);
}
