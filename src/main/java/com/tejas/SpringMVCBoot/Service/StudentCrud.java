package com.tejas.SpringMVCBoot.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tejas.SpringMVCBoot.model.Student;


@Component
public class StudentCrud {
	
	
	List<Student> studentlist = new ArrayList<Student>();;
	
	
	
	
	
	public StudentCrud() {
		
		
	}
	
	
	public Student insertStudent(int id , String name, long mob) {
		
		
		Student student = new Student();
		
		student.setId(id);
		student.setName(name);
		student.setMob(mob);
		
		studentlist.add(student);
		return student;
		

	}
	
	
	public Student findById(int id) {
		
		return studentlist.get(id);
		

	}
	
	
	
	public String updateStudent(int id , Student newstudent) {
		
		
		Student student = findById(id);
		
		if(student!=null) {
			
			studentlist.set(studentlist.indexOf(student), newstudent);
		
			return "Student insertted successfully..!";
		}
		return "There is no student .... in list  ";
	


	}
	
	
	public String deleteStudent(int id) {
		Student student =findById(id);
		
		if(student!=null) {
		    studentlist.remove(studentlist.indexOf(student));
		    return "Student deleted successfully...";
		}
		else return "Student is not present" ;
		
		
		
	}


	
	
	
	public List<Student> getStudentlist() {
		return studentlist;
	}


	public void setStudentlist(List<Student> studentlist) {
		this.studentlist = studentlist;
	}
	
	
	
	
	
	
	
	

}
