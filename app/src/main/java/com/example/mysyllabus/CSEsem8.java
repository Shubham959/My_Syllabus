package com.example.mysyllabus;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CSEsem8 extends AppCompatActivity {

    Button button4, button5, button6, button7;

    TextView detailsText;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesem8);

        detailsText=findViewById(R.id.detail);
        layout=findViewById(R.id.layout);
        layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);


        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);



        button4.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), csesem8ele.class);
            startActivity(intent);
        });

        button5.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),  csesem8ele.class);
            startActivity(intent);
        });

        button6.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),  csesem8program.class);
            startActivity(intent);
        });

        button7.setOnClickListener(v -> {
            Intent intent =new Intent(getApplicationContext(),  csesem8program.class);
            startActivity(intent);
        });
    }

    public void expand(View view){
        int v=(detailsText.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout, new AutoTransition());
        detailsText.setVisibility(v);
    }
}