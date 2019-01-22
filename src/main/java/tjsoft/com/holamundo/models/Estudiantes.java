package tjsoft.com.holamundo.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import tjsoft.com.holamundo.R;

public class Estudiantes implements Serializable {

    private int Id;
    private String Nombre;
    private String Matricula;
    private String Correo;
    private int Photo;

    public Estudiantes(){

    }

    public Estudiantes(int Id, String nombre, String matricula, String correo, int photo) {
        this.Id = Id;
        Nombre = nombre;
        Matricula = matricula;
        Correo = correo;
        Photo = photo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
