package tjsoft.com.holamundo.models;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import tjsoft.com.holamundo.R;

public class EstudiantesHelper {

    private List<Estudiantes> estudiantes;
    private Context context;
    private Gson gson = new Gson();

    public EstudiantesHelper(Context c)
    {
        context = c;
        estudiantes = new ArrayList<Estudiantes>();

        estudiantes.add(new Estudiantes(1,"Esmerlin Martínez González","100007231","esmerlinmartinez@outlook.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(2,"Yuris Coco","100010447","yuriscoco6@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(3,"José Angel Noboa","100055891","jochi3017@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(4,"Hector Ortiz","100073663","heyamil.ortiz@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(5,"Gregory Beltre Landestoy","100088332","johanselbl@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(6,"Isaias Perez","100092617","isaiasperezp07@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(7,"Rafael Mancebo","100099173","ramg9206@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(8,"José Luis Nova","100192352","josenova91@gmail.com ",R.mipmap.profile));
        estudiantes.add(new Estudiantes(9,"Moises Antonio Valdez Feliz","100202181","ingmvaldez@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(10,"Ryan Quezada","100263620","crackermanyx@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(11,"Alexander holguin cuello","100264869","alexanderfdsl03@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(12,"Alvaro Guzman","100270428","alvaroguzman3000@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(13,"Marlenis Judith Concepcion Cuevas","100301097","vampy1277@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(14,"Eri Hamilton Otero Martinez","100141783","eriotero@outlook.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(15,"Deysi Guerrero de la Rosa","AE-3760","deysimg79@hotmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(16,"Verska Hirujo Feliz","AG-8662","vhirujo@hotmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(17,"Jorge Mariano","CB-7476","dr-geek@hotmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(18,"Luis Leonardo Liberato Rodriguez","CC-2698","luisliberato9@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(19,"Arys Jose De la Cruz Contreras","CD-4696","arys.jose@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(20,"Raniel Contreras","CF-2978","ranielcontreras@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(21,"Agueda Magdalena Diaz de la Rosa","CF-4064","aguedamdiaz@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(22,"Luis Emilio Mercedes de la Cruz","CF-5583","djluis22@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(23,"Lissandro A. Sosa Vasquez","CG-4410","lissandro.sosa@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(24,"Jonathan Hernandez","CG-7076","",R.mipmap.profile));
        estudiantes.add(new Estudiantes(25,"Wellin Santana Montero","CH-8164","wesan02@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(26,"Aneury Perez","CI-1649","aneury1@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(27,"Angelica Maria Castillo Hidalgo","DA-9902","angelicacastillohidalgo@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(28,"Massiel maria aybar constancia","DD-5709","crystalm1008@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(29,"Robert Griffith de la Rosa ","DE-0333","Robert-griffith@hotmail.com ",R.mipmap.profile));
        estudiantes.add(new Estudiantes(30,"Raul Emilio Valera Florentino","DE-7998","rvalera40@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(31,"Yessica Lara","EB-4529","ye.lara89@gmail.com",R.mipmap.profile));
        estudiantes.add(new Estudiantes(32,"Erlyn Esteban Lebrón Díaz","EY-1443","erlynlebron@gmail.com",R.mipmap.profile));
        savePreference();
    }

    private void savePreference()
    {
        SharedPreferences preferences = context.getSharedPreferences("MyPreference", 0);

        if (!preferences.getBoolean("firstTime", true))
            return;

        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("firstTime",false);

        for (Estudiantes e: estudiantes) {
            String jsonEstudiante = gson.toJson(e);
            editor.putString(String.valueOf(e.getId()), jsonEstudiante);
            editor.commit();
        }
    }

    public List<Estudiantes> getEstudiantes() {
        estudiantes = new ArrayList<Estudiantes>();

        SharedPreferences preferences = context.getSharedPreferences("MyPreference", 0);

        int i = 1;

        while (preferences.getString(String.valueOf(i),null) != null)
        {
            String strEstudiante = preferences.getString(String.valueOf(i),null);

            if (strEstudiante == null)
                continue;

            Estudiantes estud = gson.fromJson(strEstudiante,Estudiantes.class);

            estudiantes.add(estud);

            i++;
        }

        return estudiantes;
    }


    public void save(Estudiantes e)
    {
        SharedPreferences preferences = context.getSharedPreferences("MyPreference",0);
        SharedPreferences.Editor editor = preferences.edit();

        String jsonEstudiante = gson.toJson(e);
        editor.putString(String.valueOf(e.getId()),jsonEstudiante);
        editor.commit();
    }

}
