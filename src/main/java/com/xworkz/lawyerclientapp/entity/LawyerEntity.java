package com.xworkz.lawyerclientapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "lawyer_details")
public class LawyerEntity {



    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "lawyer_id")
    private    int id;

    @Column(name = "lawyer_name")
    private     String name;

    @Column(name = "lawyer_email")
    private     String email;

    @Column(name = "lawyer_address")
    private     String address;

    @Column(name = "phone_number")
    private     String phoneNUmber;

    @OneToOne
    @JoinColumn(name="client_id")
    private ClientEntity client;


}
