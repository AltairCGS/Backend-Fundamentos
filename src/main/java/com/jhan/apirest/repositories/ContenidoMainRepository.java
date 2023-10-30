package com.jhan.apirest.repositories;

import com.jhan.apirest.models.ContenidoMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContenidoMainRepository extends JpaRepository <ContenidoMain, Integer> {
}
