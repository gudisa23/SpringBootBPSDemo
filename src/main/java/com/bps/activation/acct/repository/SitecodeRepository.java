package com.bps.activation.acct.repository;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bps.activation.acct.entity.Site;
public interface SitecodeRepository extends JpaRepository<Site, String> {
	 
	/*@Query("SELECT e FROM site e WHERE e.siteSid = :siteSid")
    public Optional<Site> findBySiteSid(@Param("siteSid") BigInteger siteSid);*/
	
	@Query("SELECT e FROM site e WHERE e.siteCode = :siteCode")
    public Optional<Site> findBySiteCode(@Param("siteCode") String siteCode);

}
