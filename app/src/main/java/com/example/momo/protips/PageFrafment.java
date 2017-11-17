package com.example.momo.protips;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class PageFrafment extends Fragment {
    //Declaramos los componentes
    TextView txtLifeHack;
    ImageView imgLifeHack;

    public PageFrafment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.page_fragment_layout, container, false);
        // Inflate the layout for this fragment

        txtLifeHack = (TextView) view.findViewById(R.id.txtLifeHack);//instancia text view
        Bundle bundle =getArguments();
        String message = Integer.toString(bundle.getInt("count"));
        txtLifeHack.setText("Life Hack n°"+message);

        //Instanciar ImageView
        imgLifeHack = (ImageView) view.findViewById(R.id.imgLifeHack);

        //Poner imagen online
        Picasso.with(getContext())
                .load("https://thumbs.dreamstime.com/x/sistema-binario-8193308.jpg")
                .error(R.mipmap.ic_launcher)
                .fit()
                .centerInside()
                .into(imgLifeHack)

        return  view;
    }

}
