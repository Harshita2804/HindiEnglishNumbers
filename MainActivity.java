package com.harshitasingla.hindienglishnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<numberActivity> numbers = new ArrayList<numberActivity>();
       numbers.add(new numberActivity("one", "ek", R.drawable.one));
        numbers.add(new numberActivity("two", "do", R.drawable.two));
        numbers.add(new numberActivity("three", "teen", R.drawable.three));
        numbers.add(new numberActivity("four", "chaar", R.drawable.four));
        numbers.add(new numberActivity("five", "paanch", R.drawable.five));
        numbers.add(new numberActivity("six", "che", R.drawable.six));
        numbers.add(new numberActivity("seven", "saat", R.drawable.seven));
        numbers.add(new numberActivity("eight", "aath", R.drawable.eight));
        numbers.add(new numberActivity("nine", "nau", R.drawable.nine));


        AdapterClass number = new AdapterClass(this, numbers);


        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(number);
    }

}
