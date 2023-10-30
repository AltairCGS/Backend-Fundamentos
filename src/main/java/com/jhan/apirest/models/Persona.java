package com.jhan.apirest.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class Persona {

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  protected Integer id;
  protected String nombre;
  protected String apellido;
  protected String email;


}
