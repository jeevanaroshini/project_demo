package com.dbs.project.model;

public class Customers {
	int cusID;
	long clearBalance;
	String cusName;
	boolean overdraft;
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customers(int cusID, long clearBalance, String cusName, boolean overdraft) {
		super();
		this.cusID = cusID;
		this.clearBalance = clearBalance;
		this.cusName = cusName;
		this.overdraft = overdraft;
	}
	public int getCusID() {
		return cusID;
	}
	public void setCusID(int cusID) {
		this.cusID = cusID;
	}
	public long getClearBalance() {
		return clearBalance;
	}
	public void setClearBalance(long clearBalance) {
		this.clearBalance = clearBalance;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public boolean isOverdraft() {
		return overdraft;
	}
	public void setOverdraft(boolean overdraft) {
		this.overdraft = overdraft;
	}
	
	
	

}
