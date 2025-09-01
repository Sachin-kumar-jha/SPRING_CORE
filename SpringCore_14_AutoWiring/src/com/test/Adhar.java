package com.test;

public class Adhar {
private int adharNo;
private String AdharName;
public Adhar() {
	
}
public Adhar(int adharNo, String adharName) {
	super();
	this.adharNo = adharNo;
	AdharName = adharName;
}
public int getAdharNo() {
	return adharNo;
}
public void setAdharNo(int adharNo) {
	this.adharNo = adharNo;
}
public String getAdharName() {
	return AdharName;
}
public void setAdharName(String adharName) {
	AdharName = adharName;
}
@Override
public String toString() {
	return "Adhar [adharNo=" + adharNo + ", AdharName=" + AdharName + "]";
}


}
