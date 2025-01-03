package com.cjc.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
@AutoWired 
  HomeService hs;
  @PostMapping("/addData)
  public List<Student> addData(@RequestBody List<Student> list)
  {
  List<Student> al=hs.add(list);
    return al;
  }
}
