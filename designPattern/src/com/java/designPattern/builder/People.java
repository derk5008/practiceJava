package com.java.designPattern.builder;


public class People {

private String fname;
private String lname;
 
 
private People(People.Builder builder){

 this.fname = builder.fname;
 this.lname = builder.lname;
}

public static class Builder{
	
	private String fname;
	private String lname;
	 	
	
	public Builder fname(String val){
		this.fname = val;
		return this;
	}
	public Builder lname(String val){
		this.lname = val;
		return this;
	}
	
	public People build(){
		return new People(this);
	}
	
}


public static People getInstance(){
	return new People.Builder().fname("J").lname("s").build();
}

public String toString(){
	return fname+" "+lname;
}

}


