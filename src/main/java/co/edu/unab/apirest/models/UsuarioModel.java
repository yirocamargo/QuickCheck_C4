package co.edu.unab.apirest.models;

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
@Document("usuarios")
public class UsuarioModel {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String username;
    private String contraseña;
    private boolean estado;   
    private Object role;//{"area":"","rol":""}
    /////
    /////
    
}
