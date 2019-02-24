package com.example.mycollection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Pork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pork);

        TextView txtRecipe = findViewById(R.id.txtrecipe);

        String[] text = getResources().getStringArray(R.array.pork_recipe);
        StringBuilder builder = new StringBuilder();
        for (String t :
                text) {
            builder.append(t);
            builder.append("\n");
        }
        txtRecipe.setText(builder);
    }
}
