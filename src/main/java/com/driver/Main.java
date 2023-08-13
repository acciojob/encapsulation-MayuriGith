package com.driver;

public class Main {
  public static void main(String[] args)
  {
      RWOnly obj = new RWOnly();
     // obj.name = "mayuri"; //cannot access private member
      obj.setName("mayuri");
      obj.getName();
  }
}