package com.tejas.SpringMVCBoot.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tejas.SpringMVCBoot.model.Student;

@Component
public class StudentCrud {
	
	
	List<Student> studentlist ;
	
	
	@Autowired
	Student student;
	
	public StudentCrud() {
		
		
		studentlist = new ArrayList<Student>();
		
		
	}
	
	
	public void insertStudent(int id , String name, long mob) {
		
		
		
		
		student.setId(id);
		student.setName(name);
		student.setMob(mob);
		
		studentlist.add(student);
		

	}


	public List<Student> getStudentlist() {
		return studentlist;
	}


	public void setStudentlist(List<Student> studentlist) {
		this.studentlist = studentlist;
	}
	
	
	
	
	
	

}
