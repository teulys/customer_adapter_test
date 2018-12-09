package tjsoft.com.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListActivity extends android.app.ListActivity {

    private ArrayList<String> lenguajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        definirLenguajes();

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,R.layout.item_list,R.id.tvItem,lenguajes);
        setListAdapter(mAdapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
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
