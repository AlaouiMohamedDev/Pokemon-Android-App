package com.example.pokemon_v5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static int idImage;
    public static String namePokemon;
    public static String heightPokemon;
    public static String descriptionPokemon;
    public static String categoryPokemon;
    public static String genderPokemon;
    public static String weightPokemon;

    ImageView image;
    TextView name;
    TextView desc;
    TextView height;
    TextView weight;
    TextView gender;
    TextView category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        image=findViewById(R.id.pokemonImage);
        name=findViewById(R.id.name);
        desc=findViewById(R.id.description);
        height=findViewById(R.id.height);
        weight=findViewById(R.id.weight);
        gender=findViewById(R.id.gender);
        category=findViewById(R.id.category);


        image.setImageResource(idImage);
        name.setText(namePokemon);
        desc.setText(descriptionPokemon);
        height.setText(heightPokemon);
        weight.setText(weightPokemon);
        gender.setText(genderPokemon);
        category.setText(categoryPokemon);

    }
}