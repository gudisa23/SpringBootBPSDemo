package com.bps.activation.acct.repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bps.activation.acct.entity.AcctRecord;
import com.bps.activation.acct.entity.Site;

public interface SitecodeAcctnoRepository extends JpaRepository<AcctRecord, String> {

	@Query("SELECT e FROM site e WHERE e.siteSid IN "
			+ "(SELECT a.siteSid FROM acct a WHERE a.acctNbr = :acctNbr) and e.siteCode = 'MKC'")
	public Optional<Site> getAllAcctBySiteCode(@Param("acctNbr") String acctNbr);

}
