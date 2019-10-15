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

  // Konstruktor der gleich die beiden Parameter in die DB schreibt
  public Customer(String vorname, String nachname)
  {
    this.vorname = vorname;
    this.nachname = nachname;
  }

  // ID - ist die Id und wird über "GeneratedValue" automatisch erstellt
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  // gemappt Variablen (und Spalten der Tabelle)
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

  // zur Ausgabe der Werte/Properties
  @Override
  public String toString()
  {
    String result = "";
    result = String.format("-- \nCustomer.java - toString() - Customer[id=%d]", this.id);
    result = String.format("-- \nCustomer.java - toString() - vorname:" + this.vorname);
    result = String.format("-- \nCustomer.java - toString() - nachname:" + this.nachname);
    return result;
  }

  public Long getId()
  {
    return id;
  }

}
