package com.example.momo.protips;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.kosalgeek.android.json.JsonConverter;
import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity implements AsyncResponse {
    ViewPager viewPager;
    ArrayList<Tip> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PostResponseAsyncTask task = new PostResponseAsyncTask(this);
        task.execute("http://webeasy.cl/webservice/protips/ver.php");

    }

    @Override
    public void processFinish(String resultado) {
        lista = new JsonConverter<Tip>().toArrayList(resultado, Tip.class);

        viewPager = (ViewPager) findViewById(R.id.view_pager);

        //Mandamos las listas a la clase swipeadapter
        SwipeAdapter swipeAdapter = new SwipeAdapter(getSupportFragmentManager(), lista);
        viewPager.setAdapter(swipeAdapter);
    }
}

