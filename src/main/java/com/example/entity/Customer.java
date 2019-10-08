package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer
{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Override
  public String toString()
  {
    return String.format("-- Customer.java - toString() - Customer[id=%d]", id);
  }

  public Long getId()
  {
    return id;
  }

}
