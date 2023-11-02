package com.jhan.apirest.services;

import com.jhan.apirest.models.BaseArchivo;
import com.jhan.apirest.repositories.BaseArchivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BaseArchivoService {
  @Autowired
  BaseArchivoRepository baseArchivoRepository;
  public BaseArchivo agregarArchivo(BaseArchivo baseArchivo) {
    return baseArchivoRepository.save(baseArchivo);
  }

  public  ArrayList<BaseArchivo> obtenerArchivo() {
    return (ArrayList<BaseArchivo>) baseArchivoRepository.findAll();
  }

  public boolean eliminarArchivo(Integer id) {
    try {
      baseArchivoRepository.deleteById(id);
      return true;
    }catch (Exception err){
      return false;
    }
  }
}
