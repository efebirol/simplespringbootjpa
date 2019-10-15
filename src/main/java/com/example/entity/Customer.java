package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * JPA zum speichern von Daten in eine (relationalen) Datenbank
 */

// Entity - zeigt an das es sich um eine JPA Entity für eine Tabelle handelt
@Entity
public class Customer
{

  // ID - ist die Id und wird über "GeneratedValue" automatisch erstellt
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String vorname;

  private String nachname;


  public String getVorname()
  {
    return vorname;
  }


  public void setVorname(String vorname)
  {
    this.vorname = vorname;
  }


  public String getNachname()
  {
    return nachname;
  }


  public void setNachname(String nachname)
  {
    this.nachname = nachname;
  }

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
