package com.Pruebas.CRUD.controller;

import com.Pruebas.CRUD.Service.UsuarioService;
import com.Pruebas.CRUD.model.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
    @Autowired
    private UsuarioService usuarioServ;
    
    @GetMapping ("/hola")
    public String DecirHola(){
        System.out.println("Hola");
        return "Hola";
    }
    
    @PostMapping ("/registrar")
    public void Registrar(@RequestBody Usuario usuario){
        usuarioServ.Create(usuario);
    }
    
    @GetMapping ("/ver")
    public List VerUsuarios(){
        return usuarioServ.Read();
    }
    
    @PutMapping ("/editar")
    public void Editar(@RequestBody Usuario usuario){
        usuarioServ.Update(usuario);
    }
    
    @DeleteMapping ("/borrar/{id}")
    public void Eliminar(@PathVariable("id") Long id){
        usuarioServ.Delete(id);
    }
}
