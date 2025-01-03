package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cjc.model.Student;
import com.cjc.service.HomeService;

@Controller
public class HomeController {
  
	@Autowired 
    HomeService hs;
	
    @PostMapping("/add")
    public List<Student> addData(@RequestBody List<Student> list)
    {
       List<Student> al=hs.add(list);
       return al;
    }

    @GetMapping("/get")
    public List<Student> getData()
    {
	 List<Student> li=hs.get();
	 return li;
    }
}
