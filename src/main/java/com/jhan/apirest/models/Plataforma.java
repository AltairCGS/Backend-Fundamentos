package com.jhan.apirest.models;

import lombok.Data;

import java.util.ArrayList;
@Data
public abstract class Plataforma {
  private ArrayList<ContenidoMain> contenidoMains;
  private ArrayList<BaseArchivo> baseArchivos;
  private ArrayList<Estudiante> estudiantes;
  private ArrayList<EjercicioArchivo> ejercicioArchivos;
}
