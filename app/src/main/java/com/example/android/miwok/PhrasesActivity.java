package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /*USING <ARRAYLIST> NOW WE WILL DO */

        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("one");

        words.add(new Word("where are u ", "apa"));
        words.add(new Word("what is ", "ata"));
        words.add(new Word("how are you", "ansgi"));
        words.add(new Word("how do u", "tune"));
        words.add(new Word("gello", "taachi"));
        words.add(new Word("yes i am", "challit"));
        words.add(new Word("my ball", "tete"));
        words.add(new Word("i am coming", "kollete"));
        words.add(new Word("going to scholl", "ama"));
//OR
        Word w = new Word("coming", "apa");
        words.add(w);


        WordAdapter Adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);



    }
}