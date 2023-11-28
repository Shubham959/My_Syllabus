package com.example.mysyllabus;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CSEsem5 extends AppCompatActivity {

    TextView detailsText, detailstext1, detailstext2, detailstext3,detailstext4,detailstext5,detailstext6,detailstext7,detailstext8,detailstext9;
    LinearLayout layout, layout1, layout2, layout3, layout4, layout5, layout6, layout7, layout8, layout9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesem5);


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

        detailstext5=findViewById(R.id.detail5);
        layout5=findViewById(R.id.layout5);
        layout5.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        detailstext6=findViewById(R.id.detail6);
        layout6=findViewById(R.id.layout6);
        layout6.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        detailstext7=findViewById(R.id.detail7);
        layout7=findViewById(R.id.layout7);
        layout7.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        detailstext8=findViewById(R.id.detail8);
        layout8=findViewById(R.id.layout8);
        layout8.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        detailstext9=findViewById(R.id.detail9);
        layout9=findViewById(R.id.layout9);
        layout9.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
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
    public void expand5(View view){
        int v=(detailstext5.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout5, new AutoTransition());
        detailstext5.setVisibility(v);
    }
    public void expand6(View view){
        int v=(detailstext6.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout6, new AutoTransition());
        detailstext6.setVisibility(v);
    }

    public void expand7(View view){
        int v=(detailstext7.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout7, new AutoTransition());
        detailstext7.setVisibility(v);
    }

    public void expand8(View view){
        int v=(detailstext8.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout8, new AutoTransition());
        detailstext8.setVisibility(v);
    }

    public void expand9(View view){
        int v=(detailstext9.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout9, new AutoTransition());
        detailstext9.setVisibility(v);
    }

}


