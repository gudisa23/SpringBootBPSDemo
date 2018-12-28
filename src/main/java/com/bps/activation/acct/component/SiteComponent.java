package com.bps.activation.acct.component;

import java.math.BigInteger;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bps.activation.acct.entity.Site;
import com.bps.activation.acct.repository.SiteRepository;
import com.bps.activation.exception.RecordNotFoundException;


@Component
public class SiteComponent {
	private static final Logger logger = LoggerFactory.getLogger(SiteComponent.class);

	@Autowired
	SiteRepository siteRepository;
	public SiteComponent() {
	}

	@Autowired
	public SiteComponent(SiteRepository siteRepository) {
		this.siteRepository = siteRepository;
	}

	public Site getSteDetails(BigInteger id) {
		return siteRepository.findById(id).orElseThrow(() -> new RecordNotFoundException("Site", "SiteSid", id));
	}

}
