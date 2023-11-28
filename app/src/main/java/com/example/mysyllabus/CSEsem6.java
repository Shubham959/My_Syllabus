package com.example.mysyllabus;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CSEsem6 extends AppCompatActivity {

    TextView detailsText, detailstext1, detailstext2, detailstext3,detailstext4;
    LinearLayout layout, layout1, layout2, layout3, layout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesem6);

        detailsText=findViewById(R.id.detail);
        layout=findViewById(R.id.layout);
        layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        detailstext1=findViewById(R.id.detail1);
        layout1=findViewById(R.id.layout1);
        layout1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        detailstext2=findViewById(R.id.detail2);
        layout2=findViewById(R.id.layout2);
        layout2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        detailstext3=findViewById(R.id.detail3);
        layout3=findViewById(R.id.layout3);
        layout3.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        detailstext4=findViewById(R.id.detail4);
        layout4=findViewById(R.id.layout4);
        layout4.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
    }

    public void expand(View view){
        int v=(detailsText.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout, new AutoTransition());
        detailsText.setVisibility(v);
    }
    public void expand1(View view){
        int v=(detailstext1.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout1, new AutoTransition());
        detailstext1.setVisibility(v);
    }
    public void expand2(View view){
        int v=(detailstext2.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout2, new AutoTransition());
        detailstext2.setVisibility(v);
    }
    public void expand3(View view){
        int v=(detailstext3.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout3, new AutoTransition());
        detailstext3.setVisibility(v);
    }
    public void expand4(View view){
        int v=(detailstext4.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout4, new AutoTransition());
        detailstext4.setVisibility(v);
    }
}

