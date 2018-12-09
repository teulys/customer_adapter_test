package tjsoft.com.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class segundo_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_layout);

        String mensaje = getIntent().getStringExtra("mensaje");

        TextView textView = findViewById(R.id.tvMensaje);
        textView.setTextSize(40);

        textView.setText(mensaje);

    }
}
