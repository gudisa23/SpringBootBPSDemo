package com.bps.activation.acct.controller;

import java.math.BigInteger;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bps.activation.acct.component.SiteComponent;
import com.bps.activation.acct.entity.Site;

@RestController
@RequestMapping("/site")
public class SiteController {

	private static final Logger logger = LoggerFactory.getLogger(SiteController.class);
	SiteComponent siteComponent;

	@Autowired
	SiteController(SiteComponent siteComponent) {
		this.siteComponent = siteComponent;
	}

	@RequestMapping("/get/{id}")
	Site getStetDetails(@PathVariable("id") BigInteger id) {
		return siteComponent.getSteDetails(id);
		
	}

}
