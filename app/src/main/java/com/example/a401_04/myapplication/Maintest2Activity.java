package com.example.a401_04.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.TextView;

public class Maintest2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


     //   Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("https://google.com"));
       // startActivity(intent);


        setContentView(R.layout.activity_maintest2);
        TextView tname =findViewById(R.id.tname);
        TextView tage =findViewById(R.id.tage);

        Intent intent =getIntent();

        String name=intent.getStringExtra("name");
        tname.setText(name);

        String age=intent.getStringExtra("age");
        tage.setText(age);

        PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("age",age).apply();

        PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("name",name).apply();

        Button btnclick =findViewById(R.id.click);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Maintest2Activity.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }

}
