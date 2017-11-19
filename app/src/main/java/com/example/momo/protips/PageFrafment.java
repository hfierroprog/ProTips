package com.example.momo.protips;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PageFrafment extends Fragment {
    //Declaramos los componentes
    TextView txtLifeHack;
    ImageView imgLifeHack;
    List<String> textos;
    List<String> links;

    //Se reciben las listas mediante el metodo constructor y las asignamos
    public PageFrafment(List<String> textos,List<String> links) {
        this.textos = textos;
        this.links = links;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.page_fragment_layout, container, false);
        // Inflate the layout for this fragment

        txtLifeHack = (TextView) view.findViewById(R.id.txtLifeHack);//instancia text view
        //obtener la posicion actual
        Bundle bundle =getArguments();
        int pos = bundle.getInt("count");

        //Obtenemos el texto y el link segun posicion
        String txtlife = textos.get(pos);
        String linklife = links.get(pos);

        //Asignamos el texto recien obtenido a la vista
        txtLifeHack.setText(txtlife);

        //Creamos una nueva fuente personalizada
        Typeface fuente = Typeface.createFromAsset(getContext().getAssets(), "VollkornSC-Regular.ttf");

        //Se la asignamos a nuestro texto
        txtLifeHack.setTypeface(fuente);

        //Instanciar ImageView
        imgLifeHack = (ImageView) view.findViewById(R.id.imgLifeHack);

        //Poner imagen online
        Picasso.with(getContext())
                .load(linklife)
                .error(R.mipmap.ic_launcher)
                .fit()
                .centerInside()
                .into(imgLifeHack);

        return  view;
    }
}
