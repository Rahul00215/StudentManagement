package com.rahul.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.model.Message;
import com.rahul.model.StudentMod;
import com.rahul.service.StudentServ;



@RestController
public class StudentCon {
    @Autowired
	StudentServ ss;
	  
//   @GetMapping("/student")
//	public StudentMod getStudent(@RequestParam("rollno") long rn) {
//		
//		return ss.getStudent(rn);
//	}

   @GetMapping("/student")
   public StudentMod getStudent(@RequestParam("rollno") long rollno) {
	   
	   return ss.getStudent(rollno);
   }
   
    
    @PostMapping("/post")
    public StudentMod addStudent(@RequestBody StudentMod std) {
    	
    	return ss.addStudent(std);
    }
   @GetMapping("/getall")
    public List<StudentMod> getall(){
	   
    	List<StudentMod>std=ss.getall();
    	
    	return std;
    }
   
   
   @PutMapping("/update")
   public StudentMod update(@RequestParam("rollno") long rollno, 
		   @RequestParam("name") String name,
		   @RequestParam("last") String lname,
		   @RequestParam("address") String address) {
	   
	   return ss.update(rollno , name, lname, address);
   }
   
   @DeleteMapping("/student")
   public Message delete(@RequestParam("rollno") long rollno) {
	   
	   return ss.delete(rollno);
   }
}
