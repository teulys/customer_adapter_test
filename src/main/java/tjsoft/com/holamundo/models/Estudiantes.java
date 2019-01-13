package tjsoft.com.holamundo.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import tjsoft.com.holamundo.R;

public class Estudiantes implements Serializable {

    private String Nombre;
    private String Matricula;
    private String Correo;
    private int Photo;
    private List<Estudiantes> estudiantes;

    public Estudiantes()
    {
        estudiantes = new ArrayList<Estudiantes>();

        estudiantes.add(new Estudiantes("Esmerlin Martínez González","100007231","esmerlinmartinez@outlook.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Yuris Coco","100010447","yuriscoco6@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("José Angel Noboa","100055891","jochi3017@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Hector Ortiz","100073663","heyamil.ortiz@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Gregory Beltre Landestoy","100088332","johanselbl@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Isaias Perez","100092617","isaiasperezp07@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Rafael Mancebo","100099173","ramg9206@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("José Luis Nova","100192352","josenova91@gmail.com ",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Moises Antonio Valdez Feliz","100202181","ingmvaldez@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Ryan Quezada","100263620","crackermanyx@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Alexander holguin cuello","100264869","alexanderfdsl03@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Alvaro Guzman","100270428","alvaroguzman3000@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Marlenis Judith Concepcion Cuevas","100301097","vampy1277@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Eri Hamilton Otero Martinez","100141783","eriotero@outlook.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Deysi Guerrero de la Rosa","AE-3760","deysimg79@hotmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Verska Hirujo Feliz","AG-8662","vhirujo@hotmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Jorge Mariano","CB-7476","dr-geek@hotmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Luis Leonardo Liberato Rodriguez","CC-2698","luisliberato9@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Arys Jose De la Cruz Contreras","CD-4696","arys.jose@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Raniel Contreras","CF-2978","ranielcontreras@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Agueda Magdalena Diaz de la Rosa","CF-4064","aguedamdiaz@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Luis Emilio Mercedes de la Cruz","CF-5583","djluis22@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Lissandro A. Sosa Vasquez","CG-4410","lissandro.sosa@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Jonathan Hernandez","CG-7076","",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Wellin Santana Montero","CH-8164","wesan02@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Aneury Perez","CI-1649","aneury1@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Angelica Maria Castillo Hidalgo","DA-9902","angelicacastillohidalgo@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Massiel maria aybar constancia","DD-5709","crystalm1008@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Robert Griffith de la Rosa ","DE-0333","Robert-griffith@hotmail.com ",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Raul Emilio Valera Florentino","DE-7998","rvalera40@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Yessica Lara","EB-4529","ye.lara89@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes("Erlyn Esteban Lebrón Díaz","EY-1443","erlynlebron@gmail.com",R.mipmap.profile));
    }

    public List<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public Estudiantes(String nombre, String matricula, String correo, int photo) {
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
}
