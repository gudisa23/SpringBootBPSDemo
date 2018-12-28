package com.bps.activation.acct.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bps.activation.acct.component.SitecodeCountComponent;

@RestController
@RequestMapping("/countBySiteCode")
public class SitecodeCountController {

	private static final Logger logger = LoggerFactory.getLogger(SitecodeCountController.class);
	SitecodeCountComponent sitecodeCountComponent;

	@Autowired
	SitecodeCountController(SitecodeCountComponent sitecodeCountComponent) {
		this.sitecodeCountComponent = sitecodeCountComponent;
	}

	@RequestMapping("/get/{id}")
	int getAllAcctBySiteCode(@PathVariable("id") String siteCode) {
		return sitecodeCountComponent.getCountBySiteCode(siteCode).size();
	}

}
