package com.capg.pecunia.banking;

public class Bean {
private String accountName;
private String accountNo;
private String aadharNo;
private String panNo;
Bean()
{
	
}
public Bean(String accountName, String accountNo, String aadharNo, String panNo) {
	super();
	this.accountName = accountName;
	this.accountNo = accountNo;
	this.aadharNo = aadharNo;
	this.panNo = panNo;
}
public String getAccountName() {
	return accountName;
}
public void setAccountName(String accountName) {
	this.accountName = accountName;
}
public String getAccountNo() {
	return accountNo;
}
public void setAccountNo(String accountNo) {
	this.accountNo = accountNo;
}
public String getAadharNo() {
	return aadharNo;
}
public void setAadharNo(String aadharNo) {
	this.aadharNo = aadharNo;
}
public String getPanNo() {
	return panNo;
}
public void setPanNo(String panNo) {
	this.panNo = panNo;
}
@Override
public String toString() {
	return "Bean [accountName=" + accountName + ", accountNo=" + accountNo + ", aadharNo=" + aadharNo + ", panNo="
			+ panNo + "]";
}



}
