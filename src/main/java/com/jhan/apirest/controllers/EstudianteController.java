package com.jhan.apirest.controllers;

import com.jhan.apirest.models.Estudiante;
import com.jhan.apirest.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
  @Autowired
  EstudianteService estudianteService;
  @PostMapping
  public Estudiante AgregarEstudiante(@RequestBody Estudiante estudiante) {
    return this.estudianteService.AgregarEstudiante(estudiante);
  }

  @GetMapping()
  public ArrayList<Estudiante> obtenerEstudiantes() {
    return estudianteService.obtenerEstudiantes();
  }
}
