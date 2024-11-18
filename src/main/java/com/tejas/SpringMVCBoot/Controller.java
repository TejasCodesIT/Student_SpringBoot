package com.tejas.SpringMVCBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tejas.SpringMVCBoot.Service.StudentCrud;
import com.tejas.SpringMVCBoot.model.Student;

@RestController
public class Controller {
		
    @Autowired	
	StudentCrud studentCrud;
	
		
	@PostMapping("insert")
	public String insertStudent(@RequestParam int id , String name , long mob) {
		
		studentCrud.insertStudent(id, name, mob);
		
		return "Data is inserted"+studentCrud.getStudentlist();
		
	}
	
	
	@GetMapping("fetchlist")
	public List<Student> getStudentList(){
		
		
		
		return studentCrud.getStudentlist();
		
	}
	@PutMapping("update")
	public String  updateList(@RequestParam int id ,@RequestParam int newid , @RequestParam String name , @RequestParam long mob)
	{
			Student student = studentCrud.insertStudent(newid, name, mob);
			
			return "There is "+studentCrud.updateStudent(newid, student);
		
	}
	
	@DeleteMapping("delete")
	public String deleteStudent(@RequestParam int id) {
		
		
		return studentCrud.deleteStudent(id);
		
		
	}


}








