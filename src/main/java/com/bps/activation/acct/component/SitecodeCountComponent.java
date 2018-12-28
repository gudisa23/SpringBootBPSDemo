package com.bps.activation.acct.component;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bps.activation.acct.repository.SitecodeCountRepository;

@Component
public class SitecodeCountComponent {
	private static final Logger logger = LoggerFactory.getLogger(SitecodeCountComponent.class);

	@Autowired
	SitecodeCountRepository sitecodeCountRepository;

	public SitecodeCountComponent() {
	}

	@Autowired
	public SitecodeCountComponent(SitecodeCountRepository sitecodeCountRepository) {
		this.sitecodeCountRepository = sitecodeCountRepository;
	}

	public List getCountBySiteCode(String siteCode) {
		return sitecodeCountRepository.getCountBySiteCode(siteCode);
		//return sitecodeCountRepository.getCountBySiteCode(siteCode);
		//return sitecodeCountRepository.getCountBySiteCode(siteCode).orElseThrow(() -> new RecordNotFoundException("SiteCode", "Account Number", siteCode));
	}
}
