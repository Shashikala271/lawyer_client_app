package com.xworkz.lawyerclientapp.dao;

import com.xworkz.lawyerclientapp.entity.LawyerEntity;

public interface LawyerDao {


    public boolean saveAndValidateLawyer(LawyerEntity lawyerEntity);

    public String getClientNameByLawyerId(int lawyerId);
}
