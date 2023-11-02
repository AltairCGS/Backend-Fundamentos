package com.jhan.apirest.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BaseArchivo {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private  Integer id;
  //@Basic
  private String nombre;
  @Lob
  @Column(columnDefinition = "MEDIUMTEXT")
  private String descripcion;
  private String url;
}
