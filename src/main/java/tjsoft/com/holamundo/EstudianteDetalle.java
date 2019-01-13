package tjsoft.com.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import tjsoft.com.holamundo.models.Estudiantes;

public class EstudianteDetalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estudiante_detalle);

        ImageView ivPhoto = findViewById(R.id.ivPhotoDetalle);
        TextView tvNombre = findViewById(R.id.tvNombreDetalle);
        TextView tvMatricula = findViewById(R.id.tvMatriculaDetalle);
        TextView tvCorreo = findViewById(R.id.tvCorreoDetalle);

        Estudiantes estudiantes = (Estudiantes) getIntent().getSerializableExtra("estudiante");

        ivPhoto.setImageResource(estudiantes.getPhoto());
        tvNombre.setText("Nombre: " + estudiantes.getNombre());
        tvMatricula.setText("Matricula: " + estudiantes.getMatricula());
        tvCorreo.setText("Correo: " + estudiantes.getCorreo());
    }
}
