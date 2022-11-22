package co.edu.unab.apirest.models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("listachequeo")
public class ListaChequeoModel {
    @Id
    private String _id;
    private String idEquipo;
    private String estado;
    private ArrayList <Object> Lista;
}
