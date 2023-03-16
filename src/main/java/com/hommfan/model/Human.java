package com.hommfan.model;

import org.springframework.stereotype.Component;

@Component
public class Human implements Race{

  @Override
  public String getText() {

    return "Hello!";

  }

}
