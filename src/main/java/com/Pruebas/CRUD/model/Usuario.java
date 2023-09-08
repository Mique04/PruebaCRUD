package com.Pruebas.CRUD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter @Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String nombre;
    public String apellido;
    public String email;
    public String password;
    public String usuario;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String apellido, String email, String password, String usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.usuario = usuario;
    }
}
