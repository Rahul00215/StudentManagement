package com.rahul.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentMod {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	private Long rollno;
    @Column(nullable = false) 
	private String firstname;
    @Column(nullable = false) 
	private String lastname;
    @Column(nullable = false) 
	private String address;
}
