package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /*USING <ARRAYLIST> NOW WE WILL DO */

        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("one");

        words.add(new Word("father", "apa"));
        words.add(new Word("mother", "ata"));
        words.add(new Word("son", "ansgi"));
        words.add(new Word("daughter", "tune"));
        words.add(new Word("bother", "taachi"));
        words.add(new Word("young brother", "challit"));
        words.add(new Word("older sister", "tete"));
        words.add(new Word("grand mother", "kollete"));
        words.add(new Word("grand father", "ama"));
//OR
        Word w = new Word("uncle", "apa");
        words.add(w);


        WordAdapter Adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);



    }
}