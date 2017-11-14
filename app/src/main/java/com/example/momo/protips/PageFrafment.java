package com.example.momo.protips;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PageFrafment extends Fragment {
    TextView textView ;

    public PageFrafment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.page_fragment_layout, container, false);
        // Inflate the layout for this fragment

        textView = (TextView) view.findViewById(R.id.textView);//instancia text view
        Bundle bundle =getArguments();
        String message = Integer.toString(bundle.getInt("count"));
        textView.setText("this is the"+message+"swipe view pagee..peaje pake lo goze oe");
        return  view;

    }

}
