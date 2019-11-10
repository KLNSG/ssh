package com.example.ssh.repoitory.Impl;



import com.example.ssh.entities.PublishersEntity;
import com.example.ssh.repoitory.PublishRepository;

import javax.persistence.*;
import java.util.List;

/*
public class PublicImpl implements PublishRepository {
    private EntityManagerFactory factory= Persistence.createEntityManagerFactory("manager1");
    private EntityManager manager;
    private EntityTransaction transaction;

    @Override
    public int save(PublishersEntity entity) {
        manager=factory.createEntityManager();
        transaction=manager.getTransaction();
        transaction.begin();
        manager.persist(entity);
        transaction.commit();
        manager.close();
        return 0;
    }

    @Override
    public List<PublishersEntity> findAll() {
        manager=factory.createEntityManager();
        Query query =manager.createQuery("from PublishersEntity");
        List<PublishersEntity> entities=query.getResultList();
        manager.close();
        return entities;
    }
}
*/
