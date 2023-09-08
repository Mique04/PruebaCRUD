package com.Pruebas.CRUD.Service;

import com.Pruebas.CRUD.model.Usuario;
import com.Pruebas.CRUD.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    public UsuarioRepository UsuarioRepo;
    
    @Override
    public void Create(Usuario usuario) {
        UsuarioRepo.save(usuario);
    }

    @Override
    public List Read() {
        return UsuarioRepo.findAll();
    }

    @Override
    public void Update(Usuario usuario) {
        UsuarioRepo.save(usuario);
    }

    @Override
    public void Delete(Long id) {
        UsuarioRepo.deleteById(id);
    }
    
}
