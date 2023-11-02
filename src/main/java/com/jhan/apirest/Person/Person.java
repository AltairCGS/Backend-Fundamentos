/*
PRUEBA DE PULL 3
prueba de pull 4
package com.jhan.apirest.Person;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  @Column(unique = true, nullable = false)
  private Integer id;
  @Basic
  private String firstName;
  private String lastName;
  private String email;

}
*/
