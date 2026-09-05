package com.docker.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dockerclass {
    @Autowired
	private repo r;
	@RequestMapping("/fetch")
	public List<Student> display() {
		return r.findAll();
	}
	@RequestMapping("/")
    public void add() {
		List<Student> l=new ArrayList<>();
		 Student s=new Student();
		 //s.setId(1);
		 s.setName("sai");
		 l.add(s);
		 Student s1=new Student();
		// s1.setId(2);
		 s1.setName("ram");
		 l.add(s1);
		 Student s2=new Student();
		// s1.setId(2);
		 s1.setName("laxman");
		 l.add(s2);
         r.saveAll(l);	
    }
}
