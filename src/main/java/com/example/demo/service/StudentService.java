package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AdminModel;
import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.AdnminRepository;

@Service("studService")
public class StudentService {
	@Autowired 
	AdnminRepository adrepo;
	
	
	@Autowired
	StudentRepository studRepo;
	
	public boolean fetchAdmindata() {
		return false;
	}
	
	
	public boolean isSaveAdmin(AdminModel model) {
		 
		AdminModel am=adrepo.save(model);
		return am!=null?true:false;
	}
	
	
	public List<AdminModel> fetchAdminData(AdminModel model) {
	 List<AdminModel>list =adrepo.findAll();
	 
		return list;
	}


	public List<StudentModel> viewAllStudent(StudentModel model) {
		List<StudentModel>list=studRepo.findAll();
		return list;
		
		
	}


	public boolean isSaveStudent(StudentModel stm) {
		StudentModel sm=studRepo.save(stm);
		return sm!=null?true:false;
		
	}
	
	

}
