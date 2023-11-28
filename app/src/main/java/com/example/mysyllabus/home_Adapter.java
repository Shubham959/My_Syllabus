package com.example.mysyllabus;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class home_Adapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] mainTitle;
    private final Integer[] images;

    public home_Adapter(@NonNull  Activity context1, String[] mainTitle, Integer[] images) {
        super(context1, R.layout.home_layout,mainTitle);
        this.context = context1;
        this.mainTitle = mainTitle;
        this.images = images;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.home_layout,null,true);

        TextView titleText=rowView.findViewById(R.id.title);
        ImageView imageView=rowView.findViewById(R.id.icon);

        titleText.setText(mainTitle[position]);
        imageView.setImageResource(images[position]);
        return rowView;

    }
}
