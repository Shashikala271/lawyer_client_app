package com.xworkz.lawyerclientapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientDto {


    public int id;
    public   String name;
    public String email;
    public   String address;
    public   String phoneNumber;

}
