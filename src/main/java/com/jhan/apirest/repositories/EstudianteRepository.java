package com.jhan.apirest.repositories;

import com.jhan.apirest.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository <Estudiante, Integer> {

}