package com.example.ssh.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "Books", schema = "Test", catalog = "")
public class BooksEntity {
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private BigDecimal price;
    private String publisher;
    private byte[] previewPdf;

    @Override
    public String toString() {
        return "BooksEntity{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                ", previewPdf=" + Arrays.toString(previewPdf) +
                '}';
    }

    @Id
    @Column(name = "Id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Isbn")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "Author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "Price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "Publisher")
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Basic
    @Column(name = "PreviewPdf")
    @Lob
    public byte[] getPreviewPdf() {
        return previewPdf;
    }

    public void setPreviewPdf(byte[] previewPdf) {
        this.previewPdf = previewPdf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BooksEntity that = (BooksEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(isbn, that.isbn) &&
                Objects.equals(title, that.title) &&
                Objects.equals(author, that.author) &&
                Objects.equals(price, that.price) &&
                Objects.equals(publisher, that.publisher) &&
                Arrays.equals(previewPdf, that.previewPdf);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, isbn, title, author, price, publisher);
        result = 31 * result + Arrays.hashCode(previewPdf);
        return result;
    }
}
