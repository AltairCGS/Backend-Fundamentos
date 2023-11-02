package com.jhan.apirest.repositories;

import com.jhan.apirest.models.BaseArchivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseArchivoRepository extends JpaRepository <BaseArchivo, Integer> {
}
