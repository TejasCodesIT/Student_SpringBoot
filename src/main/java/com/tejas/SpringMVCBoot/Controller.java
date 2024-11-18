package com.tejas.SpringMVCBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tejas.SpringMVCBoot.Service.StudentCrud;

@RestController
public class Controller {
	
	
	
	
	@Autowired
	StudentCrud studentCrud;
	
	
	
	
	@PostMapping("insert")
	public String insertStudent(@RequestParam int id , String name , long mob) {
		
		studentCrud.insertStudent(id, name, mob);
		
		return "Data is inserted"+studentCrud.getStudentlist();
		
	}
	


}
