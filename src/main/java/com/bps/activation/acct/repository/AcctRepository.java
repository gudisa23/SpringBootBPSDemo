package com.bps.activation.acct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bps.activation.acct.entity.AcctRecord;;

public interface AcctRepository extends JpaRepository<AcctRecord, String> {
}
