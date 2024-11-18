package com.tejas.SpringMVCBoot.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private int id;
	private String name ;
	private long mob ;

	
	
	public Student() {
		super();
	}



	public Student(int id, String name, long mob) {
		
		this.id = id;
		this.name = name;
		this.mob = mob;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getMob() {
		return mob;
	}



	public void setMob(long mob) {
		this.mob = mob;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mob=" + mob + "]";
	}
	
	
	
	
	
	

}
