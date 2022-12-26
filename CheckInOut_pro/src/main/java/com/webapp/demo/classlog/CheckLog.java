package com.webapp.demo.classlog;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CheckLog {
	
	@Id
	private String cid;
	private String cname;
	private String clogType;
	private String cdate;
	private String ctime;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getClogType() {
		return clogType;
	}
	public void setClogType(String clogType) {
		this.clogType = clogType;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
}