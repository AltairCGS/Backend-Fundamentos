package com.jhan.apirest.controllers;

import com.jhan.apirest.models.BaseArchivo;
import com.jhan.apirest.services.BaseArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/archivo")
public class BaseArchivoController {
  @Autowired
  BaseArchivoService baseArchivoService;
  @PostMapping
  public BaseArchivo agregarArchivo(@RequestBody BaseArchivo baseArchivo) {
    return baseArchivoService.agregarArchivo(baseArchivo);
  }

  @GetMapping
  public ArrayList<BaseArchivo> obtenerArchivo() {
    return baseArchivoService.obtenerArchivo();
  }

  @DeleteMapping( path = "/{id}")
  public Boolean eliminarArchivo(@PathVariable("id") Integer id) {
    return baseArchivoService.eliminarArchivo(id);
  }
}
