package com.bps.activation.acct.component;

import java.math.BigInteger;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bps.activation.acct.entity.Site;
import com.bps.activation.acct.repository.SitecodeAcctnoRepository;
import com.bps.activation.exception.RecordNotFoundException;

@Component
public class SitecodeAcctnoComponent {
	private static final Logger logger = LoggerFactory.getLogger(SitecodeAcctnoComponent.class);

	@Autowired
	SitecodeAcctnoRepository sitecodeAcctnoRepository;

	public SitecodeAcctnoComponent() {
	}

	@Autowired
	public SitecodeAcctnoComponent(SitecodeAcctnoRepository sitecodeAcctnoRepository) {
		this.sitecodeAcctnoRepository = sitecodeAcctnoRepository;
	}

	public Site getAllAcctBySiteCode(String acctNbr) {
		return sitecodeAcctnoRepository.getAllAcctBySiteCode(acctNbr).orElseThrow(() -> new RecordNotFoundException("SiteCode", "Account Number", acctNbr));
	}
}
