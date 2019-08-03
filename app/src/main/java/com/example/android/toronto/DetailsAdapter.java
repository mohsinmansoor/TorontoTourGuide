package com.example.android.toronto;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailsAdapter extends ArrayAdapter<Details> {

    private int mColorResourceID;

    public DetailsAdapter(Context context, ArrayList<Details> details, int colorResourceID) {
        super(context, 0, details);
        mColorResourceID = colorResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        Details currentView = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentView.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        addressTextView.setText(currentView.getAddress());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentView.getImageResourceId());

        View textContainer = listItemView.findViewById(R.id.linear_layout_textview);
        textContainer.setBackgroundResource(mColorResourceID);

        return listItemView;

    }
}

