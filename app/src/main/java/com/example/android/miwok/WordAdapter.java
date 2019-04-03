package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Resource ID for the category's background colour
     */
    private int backgroundColor;

    /**
     *
     * Constructor for a new word adapter.
     * Utilises the super constructor with only 2 meaningful parameters
     *
     * @param newContext The current context. Used to inflate the layour file
     * @param newWords A list of words
     */
    WordAdapter(Activity newContext, ArrayList<Word> newWords, int newColor) {
        super(newContext, 0, newWords);
        this.backgroundColor = newColor;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the translation LinearLayout and set its background color
        LinearLayout translationLinearLayout = listItemView.findViewById(R.id.translation_linear_layout);
        translationLinearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), backgroundColor));

        // Find the Miwok TextView and set its text to the Miwok translation
        TextView miwokTranslationTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTranslationTextView.setText(currentWord.getMiwokTranslation());

        // Find the default TextView and set its text to the default translation
        TextView defaultTranslationTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTranslationTextView.setText(currentWord.getDefaultTranslation());

        // Find the ImageView and set its image to the associated image for the word if it has one
        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else imageView.setVisibility(View.GONE);

        return listItemView;
    }
}
