package com.example.ssh.repoitory;

import com.example.ssh.entities.BooksEntity;
import com.example.ssh.entities.PublishersEntity;
import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.List;

public interface PublishRepository extends PagingAndSortingRepository<BooksEntity,Long> {
    Page<BooksEntity> findBooksEntitiesByPriceBetween(BigDecimal start, BigDecimal end, Pageable inst);
    Page<BooksEntity> findByAuthor(String author, Pageable inst);
    /*int save(PublishersEntity entity);
    List<PublishersEntity> findAll();*/
    @Query("select count(authorId) from AuthorsEntity")
    int aaa();

    @Query(nativeQuery = true,value = "select count(*) from Books")
    int bbb();
}
