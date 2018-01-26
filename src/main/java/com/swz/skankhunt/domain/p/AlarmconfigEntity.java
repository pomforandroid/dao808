package com.swz.skankhunt.domain.p;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "alarmconfig", schema = "gpstest", catalog = "")
public class AlarmconfigEntity {

    private Integer id;
    private Integer depId;
    private String alarmSource;
    private String alarmType;
    private Boolean enabled;
    private String name;
    private Boolean popupEnabled;
    private Boolean soundEnabled;
    private String parent;
    private Boolean statisticEnabled;
    private Byte alarmOnce;

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
    @Column(name = "depId")
    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
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
    @Column(name = "enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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
    @Column(name = "popupEnabled")
    public Boolean getPopupEnabled() {
        return popupEnabled;
    }

    public void setPopupEnabled(Boolean popupEnabled) {
        this.popupEnabled = popupEnabled;
    }

    @Basic
    @Column(name = "soundEnabled")
    public Boolean getSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(Boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    @Basic
    @Column(name = "parent")
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Basic
    @Column(name = "statisticEnabled")
    public Boolean getStatisticEnabled() {
        return statisticEnabled;
    }

    public void setStatisticEnabled(Boolean statisticEnabled) {
        this.statisticEnabled = statisticEnabled;
    }

    @Basic
    @Column(name = "alarmOnce")
    public Byte getAlarmOnce() {
        return alarmOnce;
    }

    public void setAlarmOnce(Byte alarmOnce) {
        this.alarmOnce = alarmOnce;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlarmconfigEntity that = (AlarmconfigEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(depId, that.depId) &&
                Objects.equals(alarmSource, that.alarmSource) &&
                Objects.equals(alarmType, that.alarmType) &&
                Objects.equals(enabled, that.enabled) &&
                Objects.equals(name, that.name) &&
                Objects.equals(popupEnabled, that.popupEnabled) &&
                Objects.equals(soundEnabled, that.soundEnabled) &&
                Objects.equals(parent, that.parent) &&
                Objects.equals(statisticEnabled, that.statisticEnabled) &&
                Objects.equals(alarmOnce, that.alarmOnce);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, depId, alarmSource, alarmType, enabled, name, popupEnabled, soundEnabled, parent, statisticEnabled, alarmOnce);
    }
}
