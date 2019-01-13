package tjsoft.com.holamundo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivityGrid extends AppCompatActivity {

    private ArrayList<String> lenguajes;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        definirLenguajes();

        gridView = (GridView)findViewById(R.id.gridview);


        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,R.layout.item_list,R.id.tvItem,lenguajes);
        gridView.setAdapter(mAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try
                {
                    Intent intent = new Intent(MainActivityGrid.this, segundo_activity.class);
                    intent.putExtra("mensaje", lenguajes.get(position));
                    startActivity(intent);

                } catch (Exception ex)
                {

                }
            }
        });
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
}
