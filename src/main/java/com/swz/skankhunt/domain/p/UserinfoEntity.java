package com.swz.skankhunt.domain.p;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "userinfo", schema = "gpstest", catalog = "")
public class UserinfoEntity {
    private Integer userId;
    private Timestamp createDate;
    private Boolean deleted;
    private String owner;
    private String remark;
    private Integer companyId;
    private String loginName;
    private Double mapCenterLat;
    private Double mapCenterLng;
    private Integer mapLevel;
    private String mapType;
    private String name;
    private String password;
    private String userState;
    private Timestamp loginTime;
    private String phoneNo;
    private String userType;
    private String useruid;
    private String groupuid;
    private Timestamp endDate;
    private String roleName;

    @Id
    @Column(name = "userId")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "createDate")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "owner")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "companyId")
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "loginName")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "mapCenterLat")
    public Double getMapCenterLat() {
        return mapCenterLat;
    }

    public void setMapCenterLat(Double mapCenterLat) {
        this.mapCenterLat = mapCenterLat;
    }

    @Basic
    @Column(name = "mapCenterLng")
    public Double getMapCenterLng() {
        return mapCenterLng;
    }

    public void setMapCenterLng(Double mapCenterLng) {
        this.mapCenterLng = mapCenterLng;
    }

    @Basic
    @Column(name = "mapLevel")
    public Integer getMapLevel() {
        return mapLevel;
    }

    public void setMapLevel(Integer mapLevel) {
        this.mapLevel = mapLevel;
    }

    @Basic
    @Column(name = "mapType")
    public String getMapType() {
        return mapType;
    }

    public void setMapType(String mapType) {
        this.mapType = mapType;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "userState")
    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    @Basic
    @Column(name = "loginTime")
    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    @Basic
    @Column(name = "phoneNo")
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Basic
    @Column(name = "userType")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "useruid")
    public String getUseruid() {
        return useruid;
    }

    public void setUseruid(String useruid) {
        this.useruid = useruid;
    }

    @Basic
    @Column(name = "groupuid")
    public String getGroupuid() {
        return groupuid;
    }

    public void setGroupuid(String groupuid) {
        this.groupuid = groupuid;
    }

    @Basic
    @Column(name = "endDate")
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "roleName")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserinfoEntity that = (UserinfoEntity) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(owner, that.owner) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(loginName, that.loginName) &&
                Objects.equals(mapCenterLat, that.mapCenterLat) &&
                Objects.equals(mapCenterLng, that.mapCenterLng) &&
                Objects.equals(mapLevel, that.mapLevel) &&
                Objects.equals(mapType, that.mapType) &&
                Objects.equals(name, that.name) &&
                Objects.equals(password, that.password) &&
                Objects.equals(userState, that.userState) &&
                Objects.equals(loginTime, that.loginTime) &&
                Objects.equals(phoneNo, that.phoneNo) &&
                Objects.equals(userType, that.userType) &&
                Objects.equals(useruid, that.useruid) &&
                Objects.equals(groupuid, that.groupuid) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(roleName, that.roleName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, createDate, deleted, owner, remark, companyId, loginName, mapCenterLat, mapCenterLng, mapLevel, mapType, name, password, userState, loginTime, phoneNo, userType, useruid, groupuid, endDate, roleName);
    }
}
