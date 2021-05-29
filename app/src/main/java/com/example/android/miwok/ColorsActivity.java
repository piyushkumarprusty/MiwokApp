package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /*USING <ARRAYLIST> NOW WE WILL DO */

        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("one");

        words.add(new Word("red", "wettei"));
        words.add(new Word("yellow", "chiwitte"));
        words.add(new Word("dusty", "topossa"));
        words.add(new Word("green", "chokka"));
        words.add(new Word("brown", "takkaisa"));
        words.add(new Word("gray", "topposi"));
        words.add(new Word("black", "kuluii"));
        words.add(new Word("white", "kelilli"));
        words.add(new Word("brown", "topoppi"));
//OR
        Word w = new Word("ten", "lutti");
        words.add(w);


        WordAdapter Adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);



    }
}