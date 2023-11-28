package com.example.mysyllabus;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;


public class Syllabus extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationview;
    Toolbar toolbar;



    TextView textView;

    ListView listView;

    String[] title={
            "Aeronautical",
            "CSE",
            "Mechanical",
            "Civil",
            "EEE",
            "AI and ML"
    };

    Integer[] imgs={
            R.drawable.plane,
            R.drawable.computer,
            R.drawable.mechanical,
            R.drawable.civil,
            R.drawable.aiml,
            R.drawable.eee
    };

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        textView=findViewById(R.id.textView2);

        drawerLayout=findViewById(R.id.drawerlayout);

        navigationview=findViewById(R.id.navigationview);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationview.bringToFront();
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_open,R.string.navigation_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationview.setNavigationItemSelectedListener(this);







        syllabus_adapter adapter= new syllabus_adapter(this,
                title,
                imgs);

        listView=findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            if (position==0){
                Intent intent=new Intent(getApplicationContext(), Aeronautical.class);
                startActivity(intent);
            }
            if (position==1){
                Intent intent=new Intent(getApplicationContext(), CSE.class);
                startActivity(intent);
            } if (position==2){
                Intent intent=new Intent(getApplicationContext(), Mechanical.class);
                startActivity(intent);
            } if (position==3){
                Intent intent=new Intent(getApplicationContext(), Civil.class);
                startActivity(intent);
            }
            if (position==4){
                Intent intent=new Intent(getApplicationContext(), EEE.class);
                startActivity(intent);
            }
            if (position==5){
                Intent intent=new Intent(getApplicationContext(), AI_ML.class);
                startActivity(intent);
            }
        });
    }
    public void move1(View view){
        view.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), home.class);
            startActivity(intent);
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.home_menu) {
            // Handle Syllabus item click
            Intent syllabusIntent = new Intent(getApplicationContext(), home.class);
            startActivity(syllabusIntent);
        }

        if (id == R.id.developer) {
            // Handle Syllabus item click
            Intent syllabusIntent = new Intent(getApplicationContext(), developer.class);
            startActivity(syllabusIntent);
        }

        if (id == R.id.group) {
            // Handle Syllabus item click
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://t.me/+J0GPrT6nf6NjMjY1"));
            startActivity(intent);
        }

        if (id == R.id.share) {
            // Handle Syllabus item click
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://beu.intelliexams.com/BEUEXAMS/LoginScreens/frmStudentLoginPage.aspx"));
            startActivity(intent);
        }
        if (id == R.id.feedback) {
            // Handle Syllabus item click
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://forms.gle/3qqFYrbmTC9MfhkdA"));
            startActivity(intent);
        }

        return true;
    }
}