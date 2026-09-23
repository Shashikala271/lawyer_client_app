package com.xworkz.lawyerclientapp.dao.impl;

import com.xworkz.lawyerclientapp.dao.LawyerDao;
import com.xworkz.lawyerclientapp.entity.LawyerEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class LawyerDaoImpl implements LawyerDao {


    @Override
    public boolean saveAndValidateLawyer(LawyerEntity lawyerEntity) {
        System.out.println(lawyerEntity);
        System.out.println("in DaoImpl saveAndValidateLawyer");
      EntityManager entityManager = Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
      entityManager.getTransaction().begin();
      entityManager.persist(lawyerEntity);
      entityManager.getTransaction().commit();
      entityManager.close();
      return true;


    }

    @Override
    public String getClientNameByLawyerId(int lawyerId) {

        System.out.println("In DaoImpl getClientNameByLawyerId");

        System.out.println("lawyer id "+lawyerId);
        EntityManager entityManager =Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();

    /* LawyerEntity lawyerEntity=  entityManager.find(LawyerEntity.class, lawyerId);

     if (lawyerEntity == null ) {

         System.out.println("entity is empty");

     }else{
             System.out.println(lawyerEntity.getClient());

         if (lawyerEntity.getClient()==null){
             System.out.println("entity is empty");
         }else {
             System.out.println(lawyerEntity.getClient().getName()+"Client name");
             return lawyerEntity.getClient().getName();

         }
         }*/


        String jpql="select l.client_name from LawyerEntity l where l.id = :lawyerId ";
        Query query = entityManager.createQuery(jpql);
        query.setParameter("lawyerId", lawyerId);
        String clientName = (String) query.getSingleResult();
       entityManager.close();

     return  clientName;


    }
}
