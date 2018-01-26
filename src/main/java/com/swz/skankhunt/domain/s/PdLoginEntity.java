package com.swz.skankhunt.domain.s;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Pd_Login", schema = "dbo", catalog = "Appdb")
public class PdLoginEntity {
    private Integer id;
    private String userNum;
    private String passwrod;
    private Boolean isDelete;

    @Id
    //id自增的意思，一定要加这个
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "UserNum")
    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    @Basic
    @Column(name = "Passwrod")
    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }

    @Basic
    @Column(name = "IsDelete")
    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PdLoginEntity that = (PdLoginEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(userNum, that.userNum) &&
                Objects.equals(passwrod, that.passwrod) &&
                Objects.equals(isDelete, that.isDelete);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userNum, passwrod, isDelete);
    }
}
