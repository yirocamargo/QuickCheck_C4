package co.edu.unab.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.apirest.models.ListaChequeoModel;
import co.edu.unab.apirest.services.ListaChequeoService;

@RestController
@RequestMapping(path = "listachequeo")
public class ListaChequeoController {
    @Autowired
    ListaChequeoService listaChequeoService;
    
    @GetMapping
    public List<ListaChequeoModel> getAllListaChequeo() {
        return listaChequeoService.getAllListaChequeo();
    }

    @PostMapping()
    public ListaChequeoModel saveListaChequeo(@RequestBody ListaChequeoModel usuario){
        return listaChequeoService.saveListaChequeo(usuario);
    }
    
}