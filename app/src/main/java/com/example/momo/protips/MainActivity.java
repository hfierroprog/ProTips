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

        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);

        databaseAccess.open();

        List<String> textos = databaseAccess.getTextos();
        List<String> links = databaseAccess.getLinks();

        databaseAccess.close();

        SwipeAdapter swipeAdapter = new SwipeAdapter(getSupportFragmentManager(),textos,links);
        viewPager.setAdapter(swipeAdapter);

    }
}
