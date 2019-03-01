package com.example.a401_04.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class testRecyclerAdapter extends RecyclerView.Adapter<testRecyclerAdapter.testRecyclerHolder> {



    ArrayList<String> myList ;  //barae  ine ke betavanim  dar count  bebinimesh  tedade  in  ro
    testRecyclerAdapter(ArrayList<String> list){

       myList =list ;


    }     //sakhte cunstractor cunstructor ret type nadarad


    @Override
    public testRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyckerl_layout,parent,false) ;  //har che az noe viewgroup boud aval ,shayad badan chize digari be jae parent nevesht.bayad oun view group yademoun bashe

        testRecyclerHolder holder =new testRecyclerHolder(v);


        return holder;
    }

    @Override
    public void onBindViewHolder(testRecyclerHolder holder, int position) {
/*
        switch (position) {
            case 0:
                holder.txtName.setText("pouya");
                break;

            case 1:
                holder.txtName.setText("pouya");
                break;

            case 2:
                holder.txtName.setText("pouya");
                break;

            case 3:
                holder.txtName.setText("pouya");
                break;
            case 4:
                holder.txtName.setText("pouya");
                break;
            case 5:
                holder.txtName.setText("pouya");
                break;
            case 6:
                holder.txtName.setText("pouya");
                break;
            case 7:
                holder.txtName.setText("pouya");
                break;
        }*/
holder.txtName.setText(myList.get(position));   //adadee ,get mishavad index hae hamoun position



    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    public class testRecyclerHolder extends RecyclerView.ViewHolder{

        TextView txtName ;
        public testRecyclerHolder(View itemView) {     //nested class  dar inja meghdar dehi textvies
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);

        }
    }
}
