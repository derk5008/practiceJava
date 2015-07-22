package com.java.designPattern.builder;

public class People {

private String fname;
private String lname;



public static class Builder{
	
	private String fname;
	private String lname;
	
	
	public People.Builder fname(String val){
		this.fname=val;
		return this;
	
	}
	public People.Builder lname(String val){
		this.lname = val;
		return this;
	}
	
	
	public People build(){
		return new People(this);
	}
	
}

private People(People.Builder builder){
	this.fname = builder.fname;
	this.lname =builder.lname;
			
}

public static People getInstance(){
	return new People.Builder().fname("Joseph").lname("White").build();
}



public String toString(){
    return "Name: " + fname + " " + lname + "\n" ;
  } 


}
