package com.example.pokedexe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;


import static com.example.pokedexe.R.layout.activity_pokemon;

public class PokemonActivity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView numberTextView;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_pokemon);

        String name = getIntent().getStringExtra("name");
        int number = getIntent().getIntExtra("number", 0);

        nameTextView = findViewById(R.id.pokemon_name);
        numberTextView = findViewById(R.id.pokemon_number);


        nameTextView.setText(String.format(name).toLowerCase());
        numberTextView.setText(String.format("#%03d", number));

    }
}

