package com.example.mysyllabus;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText Text;

    String name;

    Animation animate, animate_txt;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        Text=findViewById(R.id.editTextText);

        //button animation

        animate= AnimationUtils.loadAnimation(this ,
                R.anim.animate);

        animate_txt= AnimationUtils.loadAnimation(this ,
                R.anim.animate_text);

        button.setAnimation(animate);
        textView.setAnimation(animate_txt);
        Text.setAnimation(animate_txt);





        button.setOnClickListener(v -> {

            name = Text.getText().toString().trim();
            if (TextUtils.isEmpty(name)) {
                Text.setError("Please Enter your Name");
            }else{

                Intent i = new Intent(getApplicationContext(), home.class);
                i.putExtra("name", "" + name);
                startActivity(i);
                Log.i("intent", "" + name);



            }
        });
    }
}