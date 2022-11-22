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

import co.edu.unab.apirest.models.EquipoModel;
import co.edu.unab.apirest.services.EquipoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/equipo")
public class EquipoController {
    @Autowired
    EquipoService equipoService;

    @GetMapping()
    public List<EquipoModel> getListEquipos(){
        return equipoService.getAllEquipos();
    }

    @GetMapping(path = "/{id}")
    public Optional<EquipoModel> getEquipoByID(@PathVariable("id") String id){
        return equipoService.getEquipoByID(id);
    }

    @PostMapping()
    public EquipoModel saveEquipo(@RequestBody EquipoModel equipo){
        return equipoService.saveEquipo(equipo);
    }

    @DeleteMapping("/{id}")
    public String deleteEquipoById(@PathVariable("id") String id){
        return equipoService.deleteEquipo(id);
    }

    @DeleteMapping()
    public void deleteAllEquipos(){
        equipoService.deleteAllEquipos();
    }
    
}
