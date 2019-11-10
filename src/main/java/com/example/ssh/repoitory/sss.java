package com.example.ssh.repoitory;

import com.example.ssh.entities.AuthorsEntity;
import com.example.ssh.entities.BooksEntity;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface sss /*extends CrudRepository<AuthorsEntity,Long>*/ {
    List<AuthorsEntity> findAll();
    int save(AuthorsEntity a);
    int saveBook(BooksEntity book);
}
