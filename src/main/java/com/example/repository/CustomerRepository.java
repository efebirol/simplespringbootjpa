package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Customer;


/**
 * Info: Erzeugt automatisch eine Query.
 * - CrudRepository gibt mir Methode um in der DB zu suchen, speichern und zu löschen (hier: innerhalb der Customer-Entity-Klasse)
 */

public interface CustomerRepository extends CrudRepository<Customer, Long>
{

  List<Customer> findByNachname(String nachname);

  Customer findById(long id);
}
