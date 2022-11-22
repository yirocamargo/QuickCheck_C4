package co.edu.unab.apirest.models;

//import java.time.LocalDate;
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
@Document("equipos")
public class EquipoModel {
    @Id
    private String idEquipos;
    private String referencia;
    private String nombre;
    private String serial;
    private String marca;
    private boolean estado;
    private ArrayList<String> tipoEquipos;//["Teclado","Monitor","Mouse","Otro"]
    private Object ubicacion;//{"departamento":"","ciudad":"","direccion":""}
}
