package com.swz.skankhunt.domain.p;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

@CacheConfig(cacheNames = "userinfos")
public interface UserinfoEntityRepo extends JpaRepository<UserinfoEntity,Integer> {

    UserinfoEntity findByLoginNameAndPassword(String name,String password);
}
