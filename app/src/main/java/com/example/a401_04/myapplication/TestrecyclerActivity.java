package com.example.a401_04.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class TestrecyclerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testrecycler);


        //marhale sakhte list

        //shoroue marahel akhar 11

        ArrayList<String> list = new ArrayList();
        list.add("poya");
        list.add("ali");
        list.add("gholi");
        list.add("ahoura");
        list.add("reza");

        list.get(4); //index mahale 4omin meghdare list

        String s =list.get(3);

        Toast.makeText(this,s,Toast.LENGTH_LONG).show();





        //payan block ghesmate akhar1
        RecyclerView recycler =findViewById(R.id.recycler);
        testRecyclerAdapter adaptor =new testRecyclerAdapter(list);  //raftim tou adaptor cunstractor sakhtim
        recycler.setAdapter(adaptor);
        recycler.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
    }
}
