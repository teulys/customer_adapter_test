package tjsoft.com.holamundo;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import tjsoft.com.holamundo.models.Estudiantes;
import tjsoft.com.holamundo.models.EstudiantesHelper;

public class EstudianteDetalle extends AppCompatActivity {


    private Estudiantes estudiantes;
    private EditText tvNombre;
    private EditText tvMatricula;
    private EditText tvCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Detalle");
        actionBar.setDisplayShowHomeEnabled(true);

        setContentView(R.layout.estudiante_detalle);

        ImageView ivPhoto = findViewById(R.id.ivPhotoDetalle);
        tvNombre = findViewById(R.id.tvNombreDetalle);
        tvMatricula = findViewById(R.id.tvMatriculaDetalle);
        tvCorreo = findViewById(R.id.tvCorreoDetalle);

        tvNombre.setEnabled(false);
        tvMatricula.setEnabled(false);
        tvCorreo.setEnabled(false);
        //actionBar.setIcon(R.mipmap.profile);

        estudiantes = (Estudiantes) getIntent().getSerializableExtra("estudiante");

        ivPhoto.setImageResource(estudiantes.getPhoto());
        tvNombre.setText(estudiantes.getNombre());
        tvMatricula.setText(estudiantes.getMatricula());
        tvCorreo.setText(estudiantes.getCorreo());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.action_editar:
                tvNombre.setEnabled(true);
                tvMatricula.setEnabled(true);
                tvCorreo.setEnabled(true);
                //Toast.makeText(this,"Usted toco opcion Editar",Toast.LENGTH_LONG).show();
                break;
            case R.id.action_eliminar:
                Toast.makeText(this,"Usted toco opcion Eliminar",Toast.LENGTH_LONG).show();
                break;
            case R.id.action_nuevo:
                Toast.makeText(this,"Usted toco opcion Nuevo",Toast.LENGTH_LONG).show();
                break;
            case R.id.action_configuracion:
                Toast.makeText(this,"Usted toco opcion Configuracion",Toast.LENGTH_LONG).show();
                break;
            default:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v)
    {
        if(v.getId() == R.id.bt_grabar)
        {
            estudiantes.setNombre(tvNombre.getText().toString());
            estudiantes.setMatricula(tvMatricula.getText().toString());
            estudiantes.setCorreo(tvCorreo.getText().toString());

            tvNombre.setEnabled(false);
            tvMatricula.setEnabled(false);
            tvCorreo.setEnabled(false);


            EstudiantesHelper estudiantesHelper = new EstudiantesHelper(this);
            estudiantesHelper.save(estudiantes);
        }
    }
}
