package com.hello.world.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
  public Integer test();
}