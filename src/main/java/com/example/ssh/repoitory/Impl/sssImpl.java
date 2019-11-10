package com.example.ssh.repoitory.Impl;


import com.example.ssh.entities.AuthorsEntity;
import com.example.ssh.entities.BooksEntity;
import com.example.ssh.repoitory.sss;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Repository
@Table(name = "Authors")
public class sssImpl implements sss {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<AuthorsEntity> findAll() {
        Query query=manager.createQuery("from AuthorsEntity");
        List<AuthorsEntity> authors=query.getResultList();
        manager.close();
        return authors;
    }

    @Override
    @Transactional
    public int save(AuthorsEntity authorsEntity) {
        manager.persist(authorsEntity);
        manager.close();
        return 0;
    }

    @Override
    public int saveBook(BooksEntity book) {
        manager.persist(book);
        manager.close();
        return 0;
    }
}
