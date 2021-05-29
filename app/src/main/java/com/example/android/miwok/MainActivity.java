package com.example.android.miwok;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


/*          // we have deleted the numberclicklistner folder as we can also call here too
        NumbersClickListeners onClickk = new NumbersClickListeners();        // onClickk is the object
        TextView number = (TextView) findViewById(R.id.numbers);
        number.setOnClickListener(onClickk);         // HERE WE HAVE CONNECTED THE TEXTVIEW NUMBER WITH THE CLASS numberclicklistner
        or this    number.setOnClickListener(new NumbersClickListener() );

*/

        TextView number = (TextView) findViewById(R.id.numbers);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numberIntent);
            }
        });

        TextView color = (TextView) findViewById(R.id.colors);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorIntent);

            }
        });



        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });



    }




}








/*
       // THIS IS OF NO USE AS BECOZ WE ARE USING ONcLICKlISTNER
    // now we have to dlt onclick in xml code
    //THIS IS EXPLICIT INTENT AS IT IS TAKING US TO ANOTHER PAGE

    public void openNumberList(View view){
        Intent i = new Intent(this , NumbersActivity.class);
        startActivity(i);
    }

    */

    /*
        fun number(View)
        {
        val name =  name.Input.editableText.toString()

        Toast.makeText(this , "name is $name", Toast.LENGTH_LONG).show()

        }
    */

            // DIFFERENCE BETWEEN IMPLICIT INTENT AND EXPLICIT INTENT
    /*
        IMPLICIT INTENT
        Intent sendIntent = new Intent(Intent.ACTION_SENDTO);

        //Verify that the intent will resolve properly:

        if (sendIntent.resolveActivity(getPackageManager()) !=null){
        startActivity(sendIntent);
        }
    */


    /*
        EXPLICIT INTENT
         Intent sendIntent = new Intent(this , NumbersActivity.class);
         startActivity(sendIntent);

    */





