package com.example.pokemon_v5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    GridView gridView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView =findViewById(R.id.gridView);
        String [] pokemonNames= {
                "Bulbasaur","Ivysaur","Venusaur",
                "Charmander","Charmeleon","Charizard",
                "Squirtle","ButterFree"
        };
        int [] pokemonImages = {R.drawable._01,R.drawable._02,R.drawable._03,
                R.drawable._04,R.drawable._05,R.drawable._06,R.drawable._07,
                R.drawable._12
        };
        String [] pokemonDescritption={
                "There is a plant seed on its back right from the day this Pokémon is born. The seed slowly grows larger.",
                "When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.",
                "Its plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.",
                "It has a preference for hot things. When it rains, steam is said to spout from the tip of its tail.",
                "It has a barbaric nature. In battle, it whips its fiery tail around and slashes away with sharp claws.",
                "It spits fire that is hot enough to melt boulders. It may cause forest fires by blowing flames.",
                "When it retracts its long neck into its shell, it squirts out water with vigorous force.",
                "In battle, it flaps its wings at great speed to release highly toxic dust into the air."

        };
        String [] pokemonCategory ={
                "Seed",
                "Seed",
                "Seed",
                "Lizard",
                "Flame",
                "Flame",
                "Tiny Turtle",
                "Butterfly"
        };
        String [] pokemonHeight={
                "2' 04\"",
                "3' 03\"",
                "6' 07\"",
                "2' 00\"",
                "3' 07\"",
                "5' 07\"",
                "1' 08\"",
                "3' 07\""


        };
        String [] pokemonWeight ={
                "15.2lbs",
                "28.7 lbs",
                "220.5 lbs",
                "18.7 lbs",
                "41.9 lbs",
                "199.5 lbs",
                "19.8 lbs",
                "70.5 lbs"

        };
        String [] pokemonGender ={
                "Male,Female",
                "Male,Female",
                "Male,Female",
                "Male,Female",
                "Male,Female",
                "Male,Female",
                "Male,Female",
                "Male,Female"
        };
        GridAdapter gridAdapter = new GridAdapter(MainActivity.this,pokemonNames,pokemonImages);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                MainActivity2.idImage=pokemonImages[position];
                MainActivity2.namePokemon=pokemonNames[position];
                MainActivity2.heightPokemon=pokemonHeight[position];
                MainActivity2.descriptionPokemon=pokemonDescritption[position];
                MainActivity2.categoryPokemon=pokemonCategory[position];
                MainActivity2.genderPokemon=pokemonGender[position];
                MainActivity2.weightPokemon=pokemonWeight[position];
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}