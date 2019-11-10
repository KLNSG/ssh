package com.example.ssh.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Authors", schema = "Test", catalog = "")
public class AuthorsEntity {
    private Long authorId;
    private String authorName;
    private String emailAddress;
    private Gender gender;

    @Override
    public String toString() {
        return "AuthorsEntity{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    @Id
    @Column(name = "AuthorId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    @Basic
    @Column(name = "AuthorName")
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Basic
    @Column(name = "EmailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorsEntity that = (AuthorsEntity) o;
        return Objects.equals(authorId, that.authorId) &&
                Objects.equals(authorName, that.authorName) &&
                Objects.equals(emailAddress, that.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId, authorName, emailAddress);
    }

    @Basic
    @Column(name = "Gender")
    @Enumerated(EnumType.STRING)
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
