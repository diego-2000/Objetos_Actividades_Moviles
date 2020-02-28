package com.example.objetos_actividades_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lst;
    private Adapter  adap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Mascota> model= new ArrayList<>();
        Mascota mascota= new Mascota();
        mascota.setColor("negro");
        mascota.setEdad(5);
        mascota.setNombre("Botones");
        mascota.setTipo("Perro");
        mascota.setTamaño(17.5f);


        model.add(mascota);

        mascota.setColor("negro");
        mascota.setEdad(5);
        mascota.setNombre("Botones");
        mascota.setTipo("Perro");
        mascota.setTamaño(17.5f);


        model.add(mascota);

        mascota.setColor("negro");
        mascota.setEdad(5);
        mascota.setNombre("Botones");
        mascota.setTipo("Perro");
        mascota.setTamaño(17.5f);


        model.add(mascota);
        adap= new Adapter(this,model);
        lst=(ListView)findViewById(R.id.id_list);
        lst.setAdapter(adap);
        lst.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                try {
                    Mascota m=(Mascota) adap.getItem(position);
                    Log.e("nombre",m.getNombre());
                }catch (Exception e){

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
