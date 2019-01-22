package tjsoft.com.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import tjsoft.com.holamundo.adapters.EstudianteAdapter;
import tjsoft.com.holamundo.models.Estudiantes;
import tjsoft.com.holamundo.models.EstudiantesHelper;

public class ListActivity extends android.app.ListActivity {

    private ArrayList<String> lenguajes;
    private EstudiantesHelper e;
    private EstudianteAdapter mAdapter;
    private List<Estudiantes> estudiantesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        definirLenguajes();

        e = new EstudiantesHelper(this);
        //estudiantesList = e.getEstudiantes();

        //mAdapter = new EstudianteAdapter(this, estudiantesList);

        //ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,R.layout.item_list,R.id.tvItem,lenguajes);
        //setListAdapter(mAdapter);

    }

//    @Override
//    protected void onListItemClick(ListView l, View v, int position, long id) {
//        super.onListItemClick(l, v, position, id);
//
//        try
//        {
//            Intent intent = new Intent(this, segundo_activity.class);
//            intent.putExtra("mensaje", lenguajes.get(position));
//            startActivity(intent);
//
//        } catch (Exception ex)
//        {
//
//        }
//    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Estudiantes estudiantes = (Estudiantes) mAdapter.getItem(position);

        Intent intent = new Intent(this, EstudianteDetalle.class);
        intent.putExtra("estudiante", estudiantes);
        startActivity(intent);
    }

    private void definirLenguajes()
    {
        lenguajes = new ArrayList<String>();

        lenguajes.add("Kotlin");
        lenguajes.add("C#");
        lenguajes.add("C++");
        lenguajes.add("Java");
        lenguajes.add("PHP");
        lenguajes.add("JavaScript");
        lenguajes.add("Python");
        lenguajes.add("Kotlin");
    }

    @Override
    protected void onResume() {
        estudiantesList = e.getEstudiantes();
        mAdapter = new EstudianteAdapter(this, estudiantesList);
        setListAdapter(mAdapter);
        super.onResume();
    }
}
