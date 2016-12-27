package com.harshitasingla.hindienglishnumbers;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Harshita Singla on 26-12-2016.
 */
public class AdapterClass extends ArrayAdapter<numberActivity>{
    private static final String LOG_TAG = AdapterClass.class.getSimpleName();

    public AdapterClass(Activity context, ArrayList<numberActivity> numbers){

        super(context,0,numbers);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        numberActivity currentNumber= getItem(position);
        TextView HindiWord = (TextView) listItemView.findViewById(R.id.english_name);
        HindiWord.setText(currentNumber.getmEnglish());

        TextView EnglishWord = (TextView) listItemView.findViewById(R.id.hindi_name);
        HindiWord.setText(currentNumber.getmHindi());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(currentNumber.getmImageResource());
        return listItemView;




}}
