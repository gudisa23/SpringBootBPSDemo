package com.bps.activation.acct.controller;

import java.math.BigInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bps.activation.acct.component.SitecodeComponent;
import com.bps.activation.acct.entity.Site;

@RestController
@RequestMapping("/siteCode")
public class SitecodeController {

	private static final Logger logger = LoggerFactory.getLogger(SitecodeController.class);
	SitecodeComponent siteCodeComponent;

	@Autowired
	SitecodeController(SitecodeComponent siteCodeComponent) {
		this.siteCodeComponent = siteCodeComponent;
	}

	@RequestMapping("/get/{id}")
	Site getSitecode(@PathVariable("id") String id) {
		return  siteCodeComponent.getSitecode(id);
	}

}
