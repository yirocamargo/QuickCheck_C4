package co.edu.unab.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unab.apirest.models.ListaChequeoModel;
import co.edu.unab.apirest.repositories.ListaChequeoRepository;

@Service
public class ListaChequeoService {
    @Autowired
    ListaChequeoRepository listaChequeoRepository;

    public List<ListaChequeoModel> getAllListaChequeo() {
        //List<UsuarioModel> equipos = usuarioRepositoty.findAll();
        return listaChequeoRepository.findAll();
    }

    public ListaChequeoModel saveListaChequeo(ListaChequeoModel listaChequeo){
        return  listaChequeoRepository.save(listaChequeo);
    }
}
