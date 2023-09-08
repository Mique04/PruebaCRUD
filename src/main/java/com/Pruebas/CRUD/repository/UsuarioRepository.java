package com.Pruebas.CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Pruebas.CRUD.model.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
    
}
