package com.example.ssh.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "Publishers", schema = "Test", catalog = "")
public class PublishersEntity {
    private Long publisherId;
    private String publisherName;
    private String address;
    private LocalDate dateFounder;

    @Id
    @Column(name = "PublisherId")
    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    @Basic
    @Column(name = "PublisherName")
    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublishersEntity that = (PublishersEntity) o;
        return Objects.equals(publisherId, that.publisherId) &&
                Objects.equals(publisherName, that.publisherName) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisherId, publisherName, address);
    }

    @Basic
    @Column(name = "dateFounder")
    public LocalDate getDateFounder() {
        return dateFounder;
    }

    public void setDateFounder(LocalDate dateFounder) {
        this.dateFounder = dateFounder;
    }
}
