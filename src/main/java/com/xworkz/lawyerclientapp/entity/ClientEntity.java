package com.xworkz.lawyerclientapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "client_details")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private int id;

    @Column(name = "client_name")
    private    String name;

    @Column(name = "client_email")
    private String email;

    @Column(name = "client_address")
    private    String address;

    @Column(name = "phone_number")
    private    String phoneNumber;
}
