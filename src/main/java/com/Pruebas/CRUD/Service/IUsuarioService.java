package com.Pruebas.CRUD.Service;

import com.Pruebas.CRUD.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    public void Create(Usuario usuario);
    public List Read();
    public void Update(Usuario usuario);
    public void Delete(Long id); 
}
