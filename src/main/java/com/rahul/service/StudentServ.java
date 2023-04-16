package com.rahul.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.Repository.StudentRepos;
import com.rahul.model.Message;
import com.rahul.model.StudentMod;

@Service
public class StudentServ {
   @Autowired
	StudentRepos sr;
   
   public StudentMod getStudent(long rn) {
	   
	   Optional<StudentMod> std = sr.findById(rn);
	   
	   return std.isPresent() ? std.get() :new StudentMod();
	  
   }
   
   public StudentMod addStudent(StudentMod std) {
	   if(std.getAddress().isEmpty() || std.getFirstname().isEmpty() || std.getLastname().isEmpty()) {
		   return std;
	   } else {
		   return sr.save(std);
	   }
   }
   
   public List<StudentMod> getall(){
	   
	 return    (List<StudentMod>) sr.findAll();
   }

public StudentMod update(long rollno, String  name ,String lname ,String address) {
	
	StudentMod std= getStudent(rollno);
	 
	if(std.getRollno()==null) {

	return std;
	}
	else {
		std.setFirstname(name);
		
		std.setLastname(lname);
	
		std.setAddress(address);
		sr.save(std);
		
		return std;
		
	}

}

public Message delete(long rollno) {
	
	StudentMod std = getStudent(rollno);
	
	if(std.getRollno()==null) {
		return new Message("Student is  not available...!!!");
	}
	
	sr.deleteById(rollno);
	return new Message("Student has been delete succesfully....!!!!!!!");
}



}
