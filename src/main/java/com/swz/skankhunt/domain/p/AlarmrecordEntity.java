package com.swz.skankhunt.domain.p;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "alarmrecord", schema = "gpstest")
public class AlarmrecordEntity {
    private Long alarmId;
    private Timestamp createDate;
    private Byte deleted;
    private String owner;
    private String remark;
    private String alarmSource;
    private String alarmType;
    private String driver;
    private Timestamp endTime;
    private Double gas1;
    private Double gas2;
    private Double latitude;
    private Double latitude1;
    private String location;
    private String location1;
    private Double longitude;
    private Double longitude1;
    private Double mileage1;
    private Double mileage2;
    private String plateNo;
    private Integer processed;
    private Timestamp processedTime;
    private Timestamp startTime;
    private Long station;
    private String status;
    private Double timeSpan;
    private Long vehicleId;
    private Double velocity;
    private String videoFileName;
    private Integer companyId;

    @Id
    @Column(name = "alarmId")
    public Long getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(Long alarmId) {
        this.alarmId = alarmId;
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
    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
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
    @Column(name = "alarmSource")
    public String getAlarmSource() {
        return alarmSource;
    }

    public void setAlarmSource(String alarmSource) {
        this.alarmSource = alarmSource;
    }

    @Basic
    @Column(name = "alarmType")
    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    @Basic
    @Column(name = "driver")
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Basic
    @Column(name = "endTime")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "gas1")
    public Double getGas1() {
        return gas1;
    }

    public void setGas1(Double gas1) {
        this.gas1 = gas1;
    }

    @Basic
    @Column(name = "gas2")
    public Double getGas2() {
        return gas2;
    }

    public void setGas2(Double gas2) {
        this.gas2 = gas2;
    }

    @Basic
    @Column(name = "latitude")
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "latitude1")
    public Double getLatitude1() {
        return latitude1;
    }

    public void setLatitude1(Double latitude1) {
        this.latitude1 = latitude1;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "location1")
    public String getLocation1() {
        return location1;
    }

    public void setLocation1(String location1) {
        this.location1 = location1;
    }

    @Basic
    @Column(name = "longitude")
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "longitude1")
    public Double getLongitude1() {
        return longitude1;
    }

    public void setLongitude1(Double longitude1) {
        this.longitude1 = longitude1;
    }

    @Basic
    @Column(name = "mileage1")
    public Double getMileage1() {
        return mileage1;
    }

    public void setMileage1(Double mileage1) {
        this.mileage1 = mileage1;
    }

    @Basic
    @Column(name = "mileage2")
    public Double getMileage2() {
        return mileage2;
    }

    public void setMileage2(Double mileage2) {
        this.mileage2 = mileage2;
    }

    @Basic
    @Column(name = "plateNo")
    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    @Basic
    @Column(name = "processed")
    public Integer getProcessed() {
        return processed;
    }

    public void setProcessed(Integer processed) {
        this.processed = processed;
    }

    @Basic
    @Column(name = "processedTime")
    public Timestamp getProcessedTime() {
        return processedTime;
    }

    public void setProcessedTime(Timestamp processedTime) {
        this.processedTime = processedTime;
    }

    @Basic
    @Column(name = "startTime")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "station")
    public Long getStation() {
        return station;
    }

    public void setStation(Long station) {
        this.station = station;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "timeSpan")
    public Double getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(Double timeSpan) {
        this.timeSpan = timeSpan;
    }

    @Basic
    @Column(name = "vehicleId")
    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Basic
    @Column(name = "velocity")
    public Double getVelocity() {
        return velocity;
    }

    public void setVelocity(Double velocity) {
        this.velocity = velocity;
    }

    @Basic
    @Column(name = "videoFileName")
    public String getVideoFileName() {
        return videoFileName;
    }

    public void setVideoFileName(String videoFileName) {
        this.videoFileName = videoFileName;
    }

    @Basic
    @Column(name = "companyId")
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlarmrecordEntity that = (AlarmrecordEntity) o;
        return Objects.equals(alarmId, that.alarmId) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(owner, that.owner) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(alarmSource, that.alarmSource) &&
                Objects.equals(alarmType, that.alarmType) &&
                Objects.equals(driver, that.driver) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(gas1, that.gas1) &&
                Objects.equals(gas2, that.gas2) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(latitude1, that.latitude1) &&
                Objects.equals(location, that.location) &&
                Objects.equals(location1, that.location1) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(longitude1, that.longitude1) &&
                Objects.equals(mileage1, that.mileage1) &&
                Objects.equals(mileage2, that.mileage2) &&
                Objects.equals(plateNo, that.plateNo) &&
                Objects.equals(processed, that.processed) &&
                Objects.equals(processedTime, that.processedTime) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(station, that.station) &&
                Objects.equals(status, that.status) &&
                Objects.equals(timeSpan, that.timeSpan) &&
                Objects.equals(vehicleId, that.vehicleId) &&
                Objects.equals(velocity, that.velocity) &&
                Objects.equals(videoFileName, that.videoFileName) &&
                Objects.equals(companyId, that.companyId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(alarmId, createDate, deleted, owner, remark, alarmSource, alarmType, driver, endTime, gas1, gas2, latitude, latitude1, location, location1, longitude, longitude1, mileage1, mileage2, plateNo, processed, processedTime, startTime, station, status, timeSpan, vehicleId, velocity, videoFileName, companyId);
    }
}
