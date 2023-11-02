package com.jhan.apirest.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EjercicioArchivo {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private  Integer id;
  //@Basic
  private String titulo;
  @Lob
  @Column(columnDefinition = "LONGTEXT")
  private String descripcion;
  private String lenguaje;
  private String dificultad;
  @Lob
  @Column(columnDefinition = "LONGTEXT")
  private String solucion;
  @Lob
  @Column(columnDefinition = "LONGTEXT")
  private String explicacion;
  @Lob
  @Column(columnDefinition = "LONGTEXT")
  private String test;
}
