package com.jhan.apirest.controllers;

import com.jhan.apirest.models.ContenidoMain;
import com.jhan.apirest.services.ContenidoMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ContenidoMain")
public class ContenidoMainController {
  @Autowired
  ContenidoMainService contenidoMainService;
  @PostMapping
  public ContenidoMain agregarContenido(@RequestBody ContenidoMain contenidoMain) {
    return this.contenidoMainService.agregarContenido(contenidoMain);
  }

  @GetMapping
  public ArrayList<ContenidoMain> obtenerContenidos() {
    return contenidoMainService.obtenerContenidos();
  }

  @DeleteMapping(path = "/{id}")
  public String eliminarContenidoPorId(@PathVariable("id") Integer id) {
    boolean ok = this.contenidoMainService.eliminarContenido(id);
    if (ok){
      return "Se eliminó el contenido con el id " + id;
    }else {
      return "No se eliminó el contenido con el id " + id;
    }
  }
}
