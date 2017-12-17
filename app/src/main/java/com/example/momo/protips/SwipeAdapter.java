package com.example.momo.protips;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class SwipeAdapter extends FragmentStatePagerAdapter{
    private List<Tip> lista;


    //Se reciben y se almacenan ambas listas (textos,links)
    public SwipeAdapter(FragmentManager fm,List<Tip> lista) {
        super(fm);
        this.lista = lista;
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new PageFrafment(lista);
        //Mandamos la posicion mediante bundle
        Bundle bundle = new Bundle();
        bundle.putInt("count",i);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return lista.size();
    }
}
