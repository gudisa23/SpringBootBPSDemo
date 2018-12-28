package com.bps.activation.acct.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bps.activation.acct.component.AcctComponent;
import com.bps.activation.acct.entity.AcctRecord;
import com.bps.activation.acct.repository.AcctRepository;
@RestController
@RequestMapping("/acct")
public class AcctController {

	private static final Logger logger = LoggerFactory.getLogger(AcctController.class);
	AcctComponent acctComponent;
	AcctRepository acctRepository;
    @Autowired
	AcctController(AcctComponent acctComponent) {
		this.acctComponent = acctComponent;
	}

	@RequestMapping("/get/{id}")
	AcctRecord getAcctDetails(@PathVariable("id") String id) {
       return acctComponent.getAcctDetails(id);
	
	}

}
