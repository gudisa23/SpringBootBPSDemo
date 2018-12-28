package com.bps.activation.acct.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="acct")
public class AcctRecord {

    @Id
    private String acctNbr;
    
    private BigInteger acctSid ;
    private BigInteger siteSid;
    private Integer acctStatus;
    private Integer acctPriorStatus;
    private String firstName; 
    private String lastName; 
    private String addrLn1;
    private String addrLn2;
    private String addrCity;
    private String addrState;
    private String addrZipcode;
    private String contactPhoneNbr;
    private Integer maxUser;
    private Date createDate;
    private String createUser;
    private Date updateDate;
    private String updateUser;
    private BigInteger emailDomainSid;
    private Integer regState;
    private Date regStateUpdDate;
    private Integer regStateReason;
    private Date regStateReasonUpdDate;
    private String eulaVersion;
    private String regSwDnVersion;
    private String mocaPassphrase;
    
    public AcctRecord() {
	} 
	public AcctRecord(String acctNbr, BigInteger acctSid, BigInteger siteSid, Integer acctStatus,
			Integer acctPriorStatus, String firstName, String lastName, String addrLn1, String addrLn2, String addrCity,
			String addrState, String addrZipcode, String contactPhoneNbr, String dailAccessRegFlag,
			Integer dailAccessStatus, Integer dailAccessPriorStatus, Integer maxUser, Date createDate,
			String createUser, Date updateDate, String updateUser, BigInteger emailDomainSid, Integer regState,
			Date regStateUpdDate, Integer regStateReason, Date regStateReasonUpdDate, String eulaVersion,
			String regSwDnVersion, String mocaPassphrase) {
		super();
		this.acctNbr = acctNbr;
		this.acctSid = acctSid;
		this.siteSid = siteSid;
		this.acctStatus = acctStatus;
		this.acctPriorStatus = acctPriorStatus;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addrLn1 = addrLn1;
		this.addrLn2 = addrLn2;
		this.addrCity = addrCity;
		this.addrState = addrState;
		this.addrZipcode = addrZipcode;
		this.contactPhoneNbr = contactPhoneNbr;
		this.maxUser = maxUser;
		this.createDate = createDate;
		this.createUser = createUser;
		this.updateDate = updateDate;
		this.updateUser = updateUser;
		this.emailDomainSid = emailDomainSid;
		this.regState = regState;
		this.regStateUpdDate = regStateUpdDate;
		this.regStateReason = regStateReason;
		this.regStateReasonUpdDate = regStateReasonUpdDate;
		this.eulaVersion = eulaVersion;
		this.regSwDnVersion = regSwDnVersion;
		this.mocaPassphrase = mocaPassphrase;
	}
	public String getAcctNbr() {
		return acctNbr;
	}
	public void setAcctNbr(String acctNbr) {
		this.acctNbr = acctNbr;
	}
	public BigInteger getAcctSid() {
		return acctSid;
	}
	public void setAcctSid(BigInteger acctSid) {
		this.acctSid = acctSid;
	}
	public BigInteger getSiteSid() {
		return siteSid;
	}
	public void setSiteSid(BigInteger siteSid) {
		this.siteSid = siteSid;
	}
	public Integer getAcctStatus() {
		return acctStatus;
	}
	public void setAcctStatus(Integer acctStatus) {
		this.acctStatus = acctStatus;
	}
	public Integer getAcctPriorStatus() {
		return acctPriorStatus;
	}
	public void setAcctPriorStatus(Integer acctPriorStatus) {
		this.acctPriorStatus = acctPriorStatus;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddrLn1() {
		return addrLn1;
	}
	public void setAddrLn1(String addrLn1) {
		this.addrLn1 = addrLn1;
	}
	public String getAddrLn2() {
		return addrLn2;
	}
	public void setAddrLn2(String addrLn2) {
		this.addrLn2 = addrLn2;
	}
	public String getAddrCity() {
		return addrCity;
	}
	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}
	public String getAddrState() {
		return addrState;
	}
	public void setAddrState(String addrState) {
		this.addrState = addrState;
	}
	public String getAddrZipcode() {
		return addrZipcode;
	}
	public void setAddrZipcode(String addrZipcode) {
		this.addrZipcode = addrZipcode;
	}
	public String getContactPhoneNbr() {
		return contactPhoneNbr;
	}
	public void setContactPhoneNbr(String contactPhoneNbr) {
		this.contactPhoneNbr = contactPhoneNbr;
	}
	
	public Integer getMaxUser() {
		return maxUser;
	}
	public void setMaxUser(Integer maxUser) {
		this.maxUser = maxUser;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public BigInteger getEmailDomainSid() {
		return emailDomainSid;
	}
	public void setEmailDomainSid(BigInteger emailDomainSid) {
		this.emailDomainSid = emailDomainSid;
	}
	public Integer getRegState() {
		return regState;
	}
	public void setRegState(Integer regState) {
		this.regState = regState;
	}
	public Date getRegStateUpdDate() {
		return regStateUpdDate;
	}
	public void setRegStateUpdDate(Date regStateUpdDate) {
		this.regStateUpdDate = regStateUpdDate;
	}
	public Integer getRegStateReason() {
		return regStateReason;
	}
	public void setRegStateReason(Integer regStateReason) {
		this.regStateReason = regStateReason;
	}
	public Date getRegStateReasonUpdDate() {
		return regStateReasonUpdDate;
	}
	public void setRegStateReasonUpdDate(Date regStateReasonUpdDate) {
		this.regStateReasonUpdDate = regStateReasonUpdDate;
	}
	public String getEulaVersion() {
		return eulaVersion;
	}
	public void setEulaVersion(String eulaVersion) {
		this.eulaVersion = eulaVersion;
	}
	public String getRegSwDnVersion() {
		return regSwDnVersion;
	}
	public void setRegSwDnVersion(String regSwDnVersion) {
		this.regSwDnVersion = regSwDnVersion;
	}
	public String getMocapassphrase() {
		return mocaPassphrase;
	}
	public void setMocapassphrase(String mocaPassphrase) {
		this.mocaPassphrase = mocaPassphrase;
	}
	@Override
	public String toString() {
		return "AcctRecord [acctNbr=" + acctNbr + ", acctSid=" + acctSid + ", siteSid=" + siteSid + ", acctStatus="
				+ acctStatus + ", acctPriorStatus=" + acctPriorStatus + ", firstName=" + firstName + ", lastName="
				+ lastName + ", addrLn1=" + addrLn1 + ", addrLn2=" + addrLn2 + ", addrCity=" + addrCity + ", addrState="
				+ addrState + ", addrZipcode=" + addrZipcode + ", contactPhoneNbr=" + contactPhoneNbr
				+ ", dailAccessPriorStatus=" + ", maxUser=" + maxUser + ", createDate="
				+ createDate + ", createUser=" + createUser + ", updateDate=" + updateDate + ", updateUser="
				+ updateUser + ", emailDomainSid=" + emailDomainSid + ", regState=" + regState + ", regStateUpdDate="
				+ regStateUpdDate + ", regStateReason=" + regStateReason + ", regStateReasonUpdDate="
				+ regStateReasonUpdDate + ", eulaVersion=" + eulaVersion + ", regSwDnVersion=" + regSwDnVersion
				+ ", mocapassphrase=" + mocaPassphrase + "]";
	}
    
    
}
