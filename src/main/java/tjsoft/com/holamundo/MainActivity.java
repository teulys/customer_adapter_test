package tjsoft.com.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {

        EditText editText = findViewById(R.id.edMensaje);

        String texto = editText.getText().toString();

        if (texto != "") {

            Intent intent = new Intent(this, segundo_activity.class);
            intent.putExtra("mensaje",texto);
            startActivity(intent);

        }

    }
}
