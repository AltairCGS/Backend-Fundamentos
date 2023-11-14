package com.jhan.apirest.controllers;

import com.jhan.apirest.models.EjercicioArchivo;
import com.jhan.apirest.services.EjercicioArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ejercicio")
public class EjercicioArchivoController {
  @Autowired
  EjercicioArchivoService ejercicioArchivoService;
  @PostMapping
  public EjercicioArchivo agregarEjercicio(@RequestBody EjercicioArchivo ejercicioArchivo) {
    return ejercicioArchivoService.agregarEjercicio(ejercicioArchivo);
  }

  @GetMapping
  public ArrayList<EjercicioArchivo> obtenerEjercicio() {
    return ejercicioArchivoService.obtenerEjercicio();
  }

  @DeleteMapping( path = "/{id}")
  public Boolean eliminarEjercicio(@PathVariable("id") Integer id) {
    return ejercicioArchivoService.eliminarEjercicio(id);
  }

  @GetMapping( path = "/{id}")
  public Optional<EjercicioArchivo> obtenerUsuarioPorId(@PathVariable("id") Integer id) {
    return this.ejercicioArchivoService.obtenerPorId(id);
  }
}
