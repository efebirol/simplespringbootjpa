package com.example;

/*
 * Hinweis: Speiche die Main-Spring-Application in in Hauptpackage (z. B. com.example) und jedes Klasse in einem eigene darunterliegenden Package
 * (z. B. com.example.entities, com.example.controller etc.)
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AccessingDataJpaApplication
{

  public static void main(String[] args)
  {
    SpringApplication.run(AccessingDataJpaApplication.class, args);
  }

}
