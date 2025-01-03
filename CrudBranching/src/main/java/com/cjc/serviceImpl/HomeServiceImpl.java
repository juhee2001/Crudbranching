package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.HomeRepository;
import com.cjc.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeRepository hr;
	
	@Override
	public List<Student> add(List<Student> list) {
		List<Student> li=(List<Student>)hr.saveAll(list);
		return li;
	}

	@Override
	public List<Student> get() {
		List<Student> li=(List<Student>)hr.findAll();
		return li;
	}

}
