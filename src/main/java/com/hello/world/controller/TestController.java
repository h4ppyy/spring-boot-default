package com.hello.world.controller;

import javax.validation.Valid;

import com.hello.world.model.TestModel;
import com.hello.world.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

  @Autowired
	private TestService testService;

  @ResponseBody
  @RequestMapping(value="/hello", method=RequestMethod.GET)
  public String test( Model model, TestModel testModel ) {
    return testService.test();
  }
}