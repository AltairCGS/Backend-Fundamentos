package com.jhan.apirest.repositories;

import com.jhan.apirest.models.EjercicioArchivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EjercicioArchivoRepository extends JpaRepository <EjercicioArchivo, Integer> {
}
