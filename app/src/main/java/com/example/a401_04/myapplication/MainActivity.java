package com.example.a401_04.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        String name1=PreferenceManager.getDefaultSharedPreferences(this).getString("name","default NAme");

        String age1=PreferenceManager.getDefaultSharedPreferences(this).getString("age","default Age");

        Toast.makeText(MainActivity.this,name1,Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,age1,Toast.LENGTH_SHORT).show();


        final EditText name=findViewById(R.id.editFirstName);
       // final EditText family=findViewById(R.id.editfamily);
      //  final EditText phone=findViewById(R.id.editphone);
      //  final EditText email=findViewById(R.id.editemail);
        final EditText age=findViewById(R.id.editage);
        Button btnSend =findViewById(R.id.sendBtn);


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=name.getText().toString();
                String n=age.getText().toString();

                 Intent intent = new Intent(MainActivity.this, Maintest2Activity.class);
                 intent.putExtra("name",s);
                 intent.putExtra("age",n);



                startActivityForResult(intent,152);



            }
        });


    }


}
