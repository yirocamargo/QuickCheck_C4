package co.edu.unab.apirest.services;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unab.apirest.models.UsuarioModel;
import co.edu.unab.apirest.repositories.UsuarioRepositoty;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepositoty usuarioRepositoty;

    public List<UsuarioModel> getAllUsuarios() {
        //List<UsuarioModel> equipos = usuarioRepositoty.findAll();
        usuarioRepositoty.findAll().sort(Comparator.comparing(UsuarioModel::getNombre));
        usuarioRepositoty.findAll().sort(Comparator.comparing(UsuarioModel::getNombre));
        return usuarioRepositoty.findAll();
    }

    public UsuarioModel saveUsuario(UsuarioModel usuario){
        usuario.setNombre(usuario.getNombre().toLowerCase());
        return  usuarioRepositoty.save(usuario);
    }

    public String deleteUsuario (String id){
        if (usuarioRepositoty.existsById(id)){
            try{            
                usuarioRepositoty.deleteById(id);
                return "Usuario Eliminado con Exito";
            }catch (Exception e){
                return "Error al Eliminar Usuario";
            }
        }
        else{
            return "No Existe un Usuario con ese ID";
        }

        
    }

    
}
