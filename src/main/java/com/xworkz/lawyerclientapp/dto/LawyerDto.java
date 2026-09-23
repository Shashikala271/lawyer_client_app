package com.xworkz.lawyerclientapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LawyerDto {


    private    int id;
    private     String name;
    private     String email;
    private     String address;
    private     String phoneNUmber;

    private    ClientDto client;
}
