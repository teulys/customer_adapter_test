package tjsoft.com.holamundo.adapters;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import tjsoft.com.holamundo.R;
import tjsoft.com.holamundo.models.Estudiantes;

public class EstudianteAdapter  extends BaseAdapter {

    private Context context;
    private List<Estudiantes> estudiantesList;

    public EstudianteAdapter(Context context, List<Estudiantes> estudiantesList)
    {
        this.context = context;
        this.estudiantesList = estudiantesList;
    }

    @Override
    public int getCount() {
        return estudiantesList.size();
    }

    @Override
    public Object getItem(int position) {
        return estudiantesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_estudiante,parent,false);

        ImageView ivPhoto = v.findViewById(R.id.ivPhoto);
        TextView tvNombre = v.findViewById(R.id.tvNombre);
        TextView tvCorreo = v.findViewById(R.id.tvCorreo);

        ivPhoto.setImageResource(estudiantesList.get(position).getPhoto());
        tvNombre.setText(estudiantesList.get(position).getNombre());
        tvCorreo.setText(estudiantesList.get(position).getCorreo());

        return v;
    }
}
