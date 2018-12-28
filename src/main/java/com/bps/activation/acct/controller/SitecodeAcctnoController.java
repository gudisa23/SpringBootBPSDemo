package com.bps.activation.acct.controller;

import java.math.BigInteger;
import java.util.Optional;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bps.activation.acct.component.SiteComponent;
import com.bps.activation.acct.component.SitecodeAcctnoComponent;
import com.bps.activation.acct.component.SitecodeComponent;
import com.bps.activation.acct.entity.Site;

@RestController
@RequestMapping("/siteCodeByAcctno")
public class SitecodeAcctnoController {

	private static final Logger logger = LoggerFactory.getLogger(SitecodeAcctnoController.class);
	SitecodeAcctnoComponent sitecodeAcctnoComponent;

	@Autowired
	SitecodeAcctnoController(SitecodeAcctnoComponent sitecodeAcctnoComponent) {
		this.sitecodeAcctnoComponent = sitecodeAcctnoComponent;
	}

	@RequestMapping("/get/{id}")
	Site getAllAcctBySiteCode(@PathVariable("id") String id) {
		Site siteList = sitecodeAcctnoComponent.getAllAcctBySiteCode(id);
		return siteList;
	}

}
