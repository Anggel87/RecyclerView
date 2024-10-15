package com.example.recyclerview;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adaptador.PersonasAdapter;
import Modelos.Persona;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PersonasAdapter adapter;
    private List<Persona> listaPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        // Crear la lista de personas
        listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Ramiro", "871184642"));
        listaPersonas.add(new Persona("Juan", "8711884642"));

        // Pasar la lista al adaptador
        adapter = new PersonasAdapter(listaPersonas);
        recyclerView.setAdapter(adapter);
    }
}
