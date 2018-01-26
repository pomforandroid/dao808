package com.swz.skankhunt.domain.p;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//@CacheConfig(cacheNames = "alarmConfigs")
public interface AlaramConfigEntiyRepo extends JpaRepository<AlarmconfigEntity,Integer> {

}
