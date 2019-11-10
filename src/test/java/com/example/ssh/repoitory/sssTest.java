package com.example.ssh.repoitory;

import com.example.ssh.entities.AuthorsEntity;
import com.example.ssh.entities.BooksEntity;
import com.example.ssh.entities.Gender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class sssTest {

    @Autowired
    private PublishRepository Impl;

    @Test
    public void findAll() {
        System.out.println(Impl.bbb());
    }

    @Test
    public void save() {
        Page<BooksEntity> books=Impl.findBooksEntitiesByPriceBetween(new BigDecimal("100"),new BigDecimal("200"), PageRequest.of(0,2));
        System.out.println(books.getTotalElements());//总条数
        System.out.println(books.getTotalPages());//总页数
        /*Impl.findByAuthor("sss", Pageable.unpaged()).forEach(System.out::println);*/
    }

    @Test
    public void saveBook() {
       /* AuthorsEntity auth=new AuthorsEntity();
        auth.setAuthorName("Kln");
        auth.setEmailAddress("ss");
        auth.setGender(Gender.male);
        Impl.save(auth);*/
    }
}