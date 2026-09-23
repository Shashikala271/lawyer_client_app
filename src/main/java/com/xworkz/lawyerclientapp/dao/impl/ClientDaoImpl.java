package com.xworkz.lawyerclientapp.dao.impl;

import com.xworkz.lawyerclientapp.dao.ClientDao;
import com.xworkz.lawyerclientapp.entity.ClientEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

public class ClientDaoImpl implements ClientDao {

    @Override
    public boolean validateAndSaveClient(ClientEntity clientEntity) {

        EntityManager entityManager=Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(clientEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public List<ClientEntity> getAllClients() {
    EntityManager entityManager=Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
    String jpql="select c from ClientEntity c";
    Query  query=entityManager.createQuery(jpql);
   List<ClientEntity> clients=query.getResultList();
   entityManager.close();
   return clients;

    }
}
