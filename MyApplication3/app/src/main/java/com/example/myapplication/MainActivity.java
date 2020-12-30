package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movies> movieLibrary = new ArrayList<>();

        Movies a = new Movies("The Dark Knight", 2.34,9 ,"Action ",2008,R.drawable.dark);
        Movies b= new Movies("Avatar", 3,7.8,"science fiction",2009,R.drawable.avatar1);
        Movies c = new Movies("Rise of the Planet of the Apes", 1.44,7.6,"science fiction ",2011,R.drawable.monke);
        Movies d = new Movies("The Hobbit", 2.49,7.2,"Adventures",2012,R.drawable.thehobbit);
        Movies e= new Movies("The Hobbit 2", 2.40,7.8,"Adventures",2013,R.drawable.thehobbit2);
        Movies f = new Movies("The Hobbit 3", 2.50,8,"Adventures",2014,R.drawable.thehobbi3);



               movieLibrary.add(a);//0
               movieLibrary.add(b);//1
               movieLibrary.add(c);//2
               movieLibrary.add(d);//3
               movieLibrary.add(e);//4
               movieLibrary.add(f);//5

        RecyclerView moveslist = findViewById(R.id.rv);
        moveslist.setHasFixedSize(true);
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        moveslist.setLayoutManager(lm);

        MovieAdapter WorkPleas=new MovieAdapter(movieLibrary,MainActivity.this);
        moveslist.setAdapter(WorkPleas);


        MovieAdapter WP=new MovieAdapter(movieLibrary,MainActivity.this );
        moveslist.setAdapter(WP);
    }
}