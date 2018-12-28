package com.bps.activation.acct.component;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bps.activation.acct.entity.Site;
import com.bps.activation.acct.repository.SitecodeRepository;
import com.bps.activation.exception.RecordNotFoundException;


@Component
public class SitecodeComponent {
	private static final Logger logger = LoggerFactory.getLogger(SitecodeComponent.class);

	@Autowired
	SitecodeRepository siteCodeRepository;
	public SitecodeComponent() {
	}

	@Autowired
	public SitecodeComponent(SitecodeRepository siteCodeRepository) {
		this.siteCodeRepository = siteCodeRepository;
	}

	public Site   getSitecode(String siteCode) {
		return siteCodeRepository.findBySiteCode(siteCode).orElseThrow(() -> new RecordNotFoundException("Site", "id", siteCode));
	}
}
