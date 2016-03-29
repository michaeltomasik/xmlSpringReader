package com.bluesoft.entities;
// Generated 29-Mar-2016 02:15:21 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * SystemContract generated by hbm2java
 */
public class SystemContract implements java.io.Serializable {

	private long id;
	private System system;
	private Boolean active;
	private BigDecimal amount;
	private String amountPeriod;
	private String amountType;
	private BigDecimal authorizationPercent;
	private Date fromDate;
	private String orderNumber;
	private String request;
	private Date toDate;

	public SystemContract() {
	}

	public SystemContract(long id) {
		this.id = id;
	}

	public SystemContract(long id, System system, Boolean active, BigDecimal amount, String amountPeriod,
			String amountType, BigDecimal authorizationPercent, Date fromDate, String orderNumber, String request,
			Date toDate) {
		this.id = id;
		this.system = system;
		this.active = active;
		this.amount = amount;
		this.amountPeriod = amountPeriod;
		this.amountType = amountType;
		this.authorizationPercent = authorizationPercent;
		this.fromDate = fromDate;
		this.orderNumber = orderNumber;
		this.request = request;
		this.toDate = toDate;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public System getSystem() {
		return this.system;
	}

	public void setSystem(System system) {
		this.system = system;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getAmountPeriod() {
		return this.amountPeriod;
	}

	public void setAmountPeriod(String amountPeriod) {
		this.amountPeriod = amountPeriod;
	}

	public String getAmountType() {
		return this.amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public BigDecimal getAuthorizationPercent() {
		return this.authorizationPercent;
	}

	public void setAuthorizationPercent(BigDecimal authorizationPercent) {
		this.authorizationPercent = authorizationPercent;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getRequest() {
		return this.request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}
