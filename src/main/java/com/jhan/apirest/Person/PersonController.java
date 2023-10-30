/*package com.jhan.apirest.Person;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;*/

/*@RestController
@RequestMapping("/person")
//@RequiredArgsConstructor
public class PersonController {
  @Autowired
  PersonaService personaService;
  @PostMapping
  public Person createPerson(@RequestBody Person person) {

    return this.personaService.createPerson(person);

  }

  @GetMapping()
  public ArrayList<Person> ObtenerUsuario(){
    return personaService.obtenerUsuario();
  }

  @GetMapping( path = "/{id}")
  public Optional<Person> obtenerUsuarioPorId(@PathVariable("id") Integer id) {
    return this.personaService.obtenerPorId(id);
  }

  @GetMapping("/query")
  public ArrayList<Person> obtenerUsuarioPorEmail(@RequestParam("email") String email) {
    return this.personaService.obtenerPorEmail(email);
  }

  @DeleteMapping( path = "/{id}")
  public String eliminarPorId(@PathVariable("id") Integer id) {
    boolean ok = this.personaService.eliminarUsuario(id);
    if (ok){
      return "Se eliminó el usuario con el id " + id;
    }else {
      return "No pudo eliminar el usuario con el id " + id;
    }
  }

}*/
