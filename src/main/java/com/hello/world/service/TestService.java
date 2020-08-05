package com.hello.world.service;

import com.hello.world.mapper.TestMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

  @Autowired
  private TestMapper testMapper;
  
  public String test() {
    Integer test = testMapper.test();
    System.out.println(test);
    return "i am service";
  }
}