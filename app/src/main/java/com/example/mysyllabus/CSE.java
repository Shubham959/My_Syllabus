package com.example.mysyllabus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CSE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);
    }
    public void expand(View view){

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), CSEsem1.class);
                startActivity(intent);
            }
        });

    }
    //1
    public void expand1(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), CSEsem2.class);
                startActivity(intent);
            }
        });
    }
    //2
    public void expand2(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), CSEsem3.class);
                startActivity(intent);
            }
        });
    }
    //3
    public void expand3(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), CSEsem4.class);
                startActivity(intent);
            }
        });
    }
    //4
    public void expand4(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), CSEsem5.class);
                startActivity(intent);
            }
        });
    }
    //5
    public void expand5(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), CSEsem6.class);
                startActivity(intent);
            }
        });
    }
    //6
    public void expand6(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), CSEsem7.class);
                startActivity(intent);
            }
        });
    }
    //7
    public void expand7(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), CSEsem8.class);
                startActivity(intent);
            }
        });
    }
}