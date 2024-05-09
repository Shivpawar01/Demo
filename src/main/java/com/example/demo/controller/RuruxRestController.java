package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AdminModel;
import com.example.demo.model.StudentModel;
import com.example.demo.service.StudentService;

@RestController
public class RuruxRestController {
   
	@Autowired
	StudentService studService;
	boolean b;
	@PostMapping("/adminsave")
	public String isSaveAdmin(@RequestBody AdminModel model) {
		b=studService.isSaveAdmin(model);
		return b?"Admin record save...":"Fail";
				
	}
	@GetMapping("/adminfetch")
	public List<AdminModel>getUser(AdminModel model){
		return studService.fetchAdminData(model);
	}
	
	@PostMapping("/studentsave")
	public String isSaveStudent(@RequestBody StudentModel stm) {
		b=studService.isSaveStudent(stm);
		return b?"student record save...":"Fail to save student data ...";
		
	}
	@GetMapping("/studentview")
	public List<StudentModel>getAllStudent(StudentModel model){
		return studService.viewAllStudent(model);
	}
	
}

























