package com.jhan.apirest.services;

import com.jhan.apirest.models.EjercicioArchivo;
import com.jhan.apirest.repositories.EjercicioArchivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EjercicioArchivoService {
  @Autowired
  EjercicioArchivoRepository ejercicioArchivoRepository;
  public EjercicioArchivo agregarEjercicio(EjercicioArchivo ejercicioArchivo) {
    return ejercicioArchivoRepository.save(ejercicioArchivo);
  }

  public  ArrayList<EjercicioArchivo> obtenerEjercicio() {
    return (ArrayList<EjercicioArchivo>) ejercicioArchivoRepository.findAll();
  }

  public boolean eliminarEjercicio(Integer id) {
    try {
      ejercicioArchivoRepository.deleteById(id);
      return true;
    }catch (Exception err){
      return false;
    }
  }
}
