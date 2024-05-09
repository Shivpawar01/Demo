package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AdminModel;

@Repository("adrepo")
public interface AdnminRepository  extends JpaRepository<AdminModel,Integer>{
  
}
