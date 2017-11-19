package com.example.momo.protips;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import java.util.List;

public class MainActivity extends FragmentActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.view_pager);

        //Instanciamos a la clase DatabaseAccess que contiene los metodos que trabajan con sql
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);

        //Se abre la conexion a la base de datos
        databaseAccess.open();

        //Se obtienen los datos de la base de datos y se almacenan en las listas
        List<String> textos = databaseAccess.getTextos();
        List<String> links = databaseAccess.getLinks();

        //Cerramos la conexion con la base de datos
        databaseAccess.close();

        //Mandamos las listas a la clase swipeadapter
        SwipeAdapter swipeAdapter = new SwipeAdapter(getSupportFragmentManager(),textos,links);
        viewPager.setAdapter(swipeAdapter);

    }
}
