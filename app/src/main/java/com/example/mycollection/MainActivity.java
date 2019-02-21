package com.example.mycollection;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] what = {"What", "Button", "Something"};
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main,R.id.hello,what));
    }
}
