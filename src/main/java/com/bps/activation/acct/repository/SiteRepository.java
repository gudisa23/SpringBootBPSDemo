package com.bps.activation.acct.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bps.activation.acct.entity.Site;;

public interface SiteRepository extends JpaRepository<Site, BigInteger> {
	 
}
