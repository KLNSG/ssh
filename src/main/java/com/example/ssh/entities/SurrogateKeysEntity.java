package com.example.ssh.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SurrogateKeys", schema = "Test", catalog = "")
public class SurrogateKeysEntity {
    private String tableName;
    private Long keyValue;

    @Id
    @Column(name = "TableName")
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "KeyValue")
    public Long getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(Long keyValue) {
        this.keyValue = keyValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SurrogateKeysEntity that = (SurrogateKeysEntity) o;
        return Objects.equals(tableName, that.tableName) &&
                Objects.equals(keyValue, that.keyValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, keyValue);
    }
}
