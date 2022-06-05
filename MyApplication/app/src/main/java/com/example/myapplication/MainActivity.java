package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the second button */
    public void goToCredits(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);
    }

    /** Called when the user taps the first button (to generate rhyme words) */
    public void updateWords(View view) {
        TextView textView = findViewById(R.id.textView);
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        do{
            random_int2 = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        while(random_int2 == random_int);

        String message = words[random_int] + "    " + words[random_int2];
        textView.setText(message);
    }


    /** List of words to pull from */
    String[] words = {"superb", "amalgam", "monetary", "dinosaur", "detergent", "corrode", "pie",
            "clothing", "bullet train", "steroid", "gains", "mountain", "atlantic", "vinegar", "detritus",
            "subversion", "erosion", "destruction", "flannel", "grease", "coding", "studious",
            "nutrients", "hastily", "tasteful", "tropical", "coolant", "crock-pot", "fire", "vines",
            "bubbly", "couch", "lazy", "fantastic", "starting", "alarm", "hear", "elevate"};

    /** Generate random int in word list length */
    int min = 0;
    int max = words.length - 1;
    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
    int random_int2 = random_int;



}




