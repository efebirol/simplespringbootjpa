package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController
{

  @Value("${server.port}")
  private String serverport;

  @RequestMapping(value = "/testme")
  public String getCustomer()
  {
    return "Starte <b>" + serverport + "</b> für den Zugang zur H2-Hibernate GUI";
  }
}
