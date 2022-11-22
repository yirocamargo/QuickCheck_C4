package co.edu.unab.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import co.edu.unab.apirest.models.EquipoModel;
import co.edu.unab.apirest.repositories.EquipoRepository;


@Service
public class EquipoService {
    @Autowired
    EquipoRepository equipoRepository;

    public EquipoModel saveEquipo(EquipoModel equipo){
        equipo.setNombre(equipo.getNombre().toLowerCase());
        return  equipoRepository.save(equipo);
    }

    public List<EquipoModel> getAllEquipos() {
        List<EquipoModel> equipos = equipoRepository.findAll();
        equipos.sort(Comparator.comparing(EquipoModel::getNombre));
        //equipoRepository.findAll().sort(Comparator.comparing(EquipoModel::getNombre));
        return equipos;
    }

    public Optional <EquipoModel> getEquipoByID (String id){
        return equipoRepository.findById(id);//{"id"}
    }

    public Optional <EquipoModel> getEquipoById (String id){
        return equipoRepository.findById(id);
    }

    public String deleteEquipo (String id){
        if (equipoRepository.existsById(id)){
            try{            
                equipoRepository.deleteById(id);
                return "Equipo Eliminado con Exito";
            }catch (Exception e){
                return "Error al Eliminar Equipo";
            }
        }
        else{
            return "No Existe un Equipo con ese ID";
        }

        
    }

    public void deleteAllEquipos(){
        equipoRepository.deleteAll();
    }
}
