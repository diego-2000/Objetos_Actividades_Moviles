package com.example.objetos_actividades_moviles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    private Context context;
    private ArrayList<Mascota> arr;

    public Adapter(Context contesto, ArrayList<Mascota> arr){
        this.context=contesto;
        this.arr=arr;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int position) {
        return arr.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView= layoutInflater.inflate(R.layout.respuesta,null);
        }

        TextView nombre =(TextView)convertView.findViewById(R.id.id_nombre);
        TextView edad =(TextView)convertView.findViewById(R.id.id_edad);
        nombre.setText(arr.get(position).getNombre());
        edad.setText(arr.get(position).getEdad());
        return convertView;
    }
}
