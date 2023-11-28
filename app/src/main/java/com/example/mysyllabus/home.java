package com.example.mysyllabus;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationview;
    Toolbar toolbar;



    TextView textView;

    ListView listView;

    String[] title={
            "Syllabus",
            "Result",
            "Holiday",
            "BEU",
            "Form Fill"
    };

    Integer[] imgs={
            R.drawable.images,
            R.drawable.result,
            R.drawable.holiday,
            R.drawable.beupatna_logo,
            R.drawable.form
    };

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout=findViewById(R.id.drawerlayout);

        toolbar=findViewById(R.id.toolbar);

        navigationview=findViewById(R.id.navigationview);

        setSupportActionBar(toolbar);

        navigationview.bringToFront();
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_open,R.string.navigation_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationview.setNavigationItemSelectedListener(this);







        textView=findViewById(R.id.textView2);
        Intent i=getIntent();
        String namey=i.getStringExtra("name");
        textView.setText(namey);

        home_Adapter adapter=new home_Adapter(this,
                title,
                imgs);

        listView=findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            if(position==4){
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://beu.intelliexams.com/BEUEXAMS/LoginScreens/frmStudentLoginPage.aspx"));
                startActivity(intent);
            }
            if(position==1){
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://results.beup.ac.in/"));
                startActivity(intent);
            }
            if(position==3){
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://beu-bih.ac.in/BEUP/NoticeBoard.aspx"));
                startActivity(intent);
            }
            if(position==2){
                Intent intent=new Intent(getApplicationContext(), Holiday.class);
                startActivity(intent);
            }
            if(position==0){
                Intent intent=new Intent(getApplicationContext(), Syllabus.class);
                startActivity(intent);
            }
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
           Intent intent=new Intent(Intent.ACTION_SEND);
           intent.setType("text/plain");
           intent.putExtra(Intent.EXTRA_SUBJECT,"Check out the application");
           intent.putExtra(Intent.EXTRA_TEXT,"http://beu-bih.ac.in/BEUP/NoticeBoard.aspx");
           startActivity(Intent.createChooser(intent,"Share Via"));
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


