package com.example.mycollection;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.net.URI;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] what = {"Fluffy Pancakes", "Hamburgers", "Caribbean Pork Chops"};
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main,R.id.hello,what));

    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://tasty.co/recipe/fluffy-perfect-pancakes")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://tasty.co/recipe/mexican-chorizo-burger")));
                break;
            case 2:
                startActivity(new Intent(this,Pork.class));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lifeloveandsugar.com/turtle-cheesecake/")));
                break;
            case 4:
                break;
        }
    }
}
