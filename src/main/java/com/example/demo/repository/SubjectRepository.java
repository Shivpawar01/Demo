package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SubjectModel;

@Repository("subRepo")
public interface SubjectRepository extends JpaRepository<SubjectModel,Integer>{
	
	

}
