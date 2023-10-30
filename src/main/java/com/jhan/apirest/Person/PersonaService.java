/*
package com.jhan.apirest.Person;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
*/

/*@Service
public class PersonaService {
  @Autowired
  PersonRepository personRepo;
  public Person createPerson(Person person) {
    return personRepo.save(person);
  }

  public ArrayList<Person> obtenerUsuario(){
    return (ArrayList<Person>) personRepo.findAll();
  }

  public Optional<Person> obtenerPorId(Integer id) {
    return personRepo.findById(id);
  }

  public ArrayList<Person> obtenerPorEmail(String email) {
    return personRepo.findByemail(email);
  }

  public boolean eliminarUsuario(Integer id) {
    try {
      personRepo.deleteById(id);
      return true;
    }catch (Exception err){
      return false;
    }
  }

}*/
