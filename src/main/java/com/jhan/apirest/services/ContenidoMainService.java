package com.jhan.apirest.services;

import com.jhan.apirest.models.ContenidoMain;
import com.jhan.apirest.repositories.ContenidoMainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ContenidoMainService {
  @Autowired
  ContenidoMainRepository contenidoMainRepository;

  public ContenidoMain agregarContenido(ContenidoMain contenidoMain) {
    return contenidoMainRepository.save(contenidoMain);
  }

  public ArrayList<ContenidoMain> obtenerContenidos() {
    return (ArrayList<ContenidoMain>) contenidoMainRepository.findAll();
  }

  public boolean eliminarContenido(Integer id) {
    try {
      contenidoMainRepository.deleteById(id);
      return true;
    }catch (Exception err){
      return false;
    }
  }

}
