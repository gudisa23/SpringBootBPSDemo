package com.bps.activation.acct.component;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bps.activation.acct.entity.AcctRecord;
import com.bps.activation.acct.repository.AcctRepository;
import com.bps.activation.exception.RecordNotFoundException;

@Component
public class AcctComponent {
	private static final Logger logger = LoggerFactory.getLogger(AcctComponent.class);

	@Autowired
	AcctRepository acctRepository;
	
	public AcctComponent() {
	}

	@Autowired
	public AcctComponent(AcctRepository acctRepository) {
		this.acctRepository = acctRepository;
	}

	public AcctRecord getAcctDetails(String id) {
		return acctRepository.findById(id).orElseThrow(() -> new RecordNotFoundException("AcctRecord", "id", id));
	}
}
