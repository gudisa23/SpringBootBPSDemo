package com.bps.activation.acct.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bps.activation.acct.entity.Site;

public interface SitecodeCountRepository extends JpaRepository<Site, String> {

	@Query("SELECT distinct(a) FROM acct a WHERE a.siteSid  IN "
			+ "(SELECT s.siteSid FROM site s WHERE s.siteCode = :siteCode)")
	public List getCountBySiteCode(@Param("siteCode") String siteCode);

}
