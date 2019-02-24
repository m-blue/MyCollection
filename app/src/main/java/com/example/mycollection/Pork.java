package com.example.mycollection;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.widget.Toast;

public class Pork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pork);

        TextView txtRecipe = findViewById(R.id.txtrecipe);
        TextView txtInstructions = findViewById(R.id.txtInstructions);
        txtInstructions.setMovementMethod(new ScrollingMovementMethod());

        String[] recipe = {"1 tsp. ground allspice",
                "1 tsp. freshly ground black pepper",
                "1 tsp. ground cinnamon",
                "1/2 tsp. ground nutmeg",
                "2 tsp. dried thyme",
                "1/2 cup scallions, finely chopped",
                "3 Tbs soy sauce",
                "2 Tbs fresh ginger, grated",
                "1 chile pepper, seeded and minced",
                "2 tsp sugar",
                "1 tsp salt",
                "4 lean pork chops, 1-inch thick"};

        String instructions = "In a food processor, combine all of the herbs and spices" +
                " with the scallions, soy sauce, fresh ginger, chile pepper," +
                " garlic, sugar and salt, and process to a coarse paste." +
                "Coat the pork chops with this paste and place in a slow cooker. " +
                "Cover; cook on Low for 7 to 9 hours (or on High for 4 to 5 hours)";

        StringBuilder builder = new StringBuilder();
        for (String r :
               recipe) {
           builder.append(r);
           builder.append("\n");
        }

        txtInstructions.setText(instructions);
        txtRecipe.setText(builder);
    }
}
