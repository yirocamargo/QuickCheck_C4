package co.edu.unab.apirest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.apirest.models.UsuarioModel;
import co.edu.unab.apirest.services.UsuarioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "usuarios")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping
    public List<UsuarioModel> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> getUsuarioByID(@PathVariable("id") String id){
        return usuarioService.getUsuarioByID(id);
    }

    @PostMapping()
    public UsuarioModel saveUsuario(@RequestBody UsuarioModel usuario){
        return usuarioService.saveUsuario(usuario);
    }
    
    @DeleteMapping("/{id}")
    public String deletUsuarioById(@PathVariable("id") String id){
        return usuarioService.deleteUsuario(id);
    }

    //////

    /////
}
