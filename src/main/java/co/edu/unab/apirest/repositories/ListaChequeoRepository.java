package co.edu.unab.apirest.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.apirest.models.ListaChequeoModel;

@Repository
public interface ListaChequeoRepository extends MongoRepository <ListaChequeoModel,String>{
    
}
