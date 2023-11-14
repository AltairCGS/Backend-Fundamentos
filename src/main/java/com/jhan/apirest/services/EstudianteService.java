package com.jhan.apirest.services;

import com.jhan.apirest.models.Estudiante;
import com.jhan.apirest.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

@Service
public class EstudianteService {
  @Autowired
  EstudianteRepository estudianteRepository;
  public Estudiante AgregarEstudiante(Estudiante estudiante) {
    return estudianteRepository.save(estudiante);
  }

  public ArrayList<Estudiante> obtenerEstudiantes() {
    return (ArrayList<Estudiante>) estudianteRepository.findAll();
  }
  public ArrayList<Estudiante> obtenerPorEmail(String email) {
    return estudianteRepository.findByemail(email);
  }
}
