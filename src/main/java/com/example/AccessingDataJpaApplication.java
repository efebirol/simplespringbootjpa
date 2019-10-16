package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
/*
 * Hinweis: Speichere die Main-Spring-Application in in Hauptpackage (z. B. com.example) und jedes Klasse in einem eigene darunterliegenden Package
 * (z. B. com.example.entities, com.example.controller etc.)
 * - siehe @SpringBootApplication -> enhält @ComponentScan, welche alle, unterhalb dieser Package (hier: com.example)
 * liegenden Components, Configurations und Services suchen lässt
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.entity.Customer;
import com.example.repository.CustomerRepository;


@SpringBootApplication
public class AccessingDataJpaApplication
{

  private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

  public static void main(String[] args)
  {
    SpringApplication.run(AccessingDataJpaApplication.class, args);
  }

  @Bean
  public CommandLineRunner demo(CustomerRepository repository)
  {
    return (args) -> {
      log.info("-- AccessingDataJpaApplication.java - demo() - Speichere Daten über JPA in die DB. Siehe http://localhost:8080/h2-console");
      repository.save(new Customer("Jack", "Bauer"));
      repository.save(new Customer("TestVorname", "Testnachname"));
      repository.save(new Customer("Be", "One"));

      log.info("\n-- AccessingDataJpaApplication.java - demo() - Benutze CRUD Methode um alle auszulesen findAll():");
      for ( Customer repoCustomer : repository.findAll() )
      {
        log.info(repoCustomer.getId() + ". Vorname: " + repoCustomer.getVorname() + " Nachname: " + repoCustomer.getNachname());
        // log.info(repoCustomer.toString());
      }

      log.info("\n-- AccessingDataJpaApplication.java - demo() - Benutze CRUD Methode um Einzelne auszulesen über ID findById():");
      Customer customer = repository.findById(2L);
      log.info("Customer found with findById(1L):");
      log.info("--------------------------------");
      log.info(customer.toString());

      log.info("\n-- AccessingDataJpaApplication.java - demo() - Benutze CRUD Methode um Einzelne auszulesen über Namen findByNachname():");
      for ( Customer bauer : repository.findByNachname("Bauer") )
      {
        log.info(bauer.toString());
      }

    };
  }
}
