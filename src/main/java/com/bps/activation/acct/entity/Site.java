package com.bps.activation.acct.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name="site")
public class Site {
	
	    @Id
	    private BigInteger  siteSid;
	    
	    private String siteCode ;
	    private String siteName;
	    
	    public Site() {
		} 
		public Site(BigInteger siteSid, String siteCode, String siteName) {
			super();
			this.siteSid = siteSid;
			this.siteCode = siteCode;
			this.siteName = siteName;
		}
		public BigInteger getSiteSid() {
			return siteSid;
		}
		public void setSiteSid(BigInteger siteSid) {
			this.siteSid = siteSid;
		}
		public String getSiteCode() {
			return siteCode;
		}
		public void setSiteCode(String siteCode) {
			this.siteCode = siteCode;
		}
		public String getSiteName() {
			return siteName;
		}
		public void setSiteName(String siteName) {
			this.siteName = siteName;
		}
    
}
