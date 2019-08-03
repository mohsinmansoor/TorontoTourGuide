package com.example.android.toronto;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);

        final ArrayList<Details> details = new ArrayList<Details>();

        details.add(new Details("Fairmont Royal York", "100 Front Street W, Toronto", R.drawable.hotel_fairmont_royal_york));
        details.add(new Details("The Westin Harbour Castle", "1 Harbour Square, Toronto", R.drawable.hotel_westin));
        details.add(new Details("One King West Hotel & Residence", "1 King Street West King & Yonge, Toronto", R.drawable.hotel_one_king_west));
        details.add(new Details("Best Western Plus Travel Hotel", "5503 Eglinton Ave West, Toronto", R.drawable.hotel_best_western));
        details.add(new Details("Novotel Toronto Centre", "45 The Esplanade, Toronto", R.drawable.hotel_novotel_2));


        DetailsAdapter adapter = new DetailsAdapter(getActivity(), details, R.color.colorPrimary);

        ListView listView = rootView.findViewById(R.id.details_list);

        listView.setAdapter(adapter);

        return listView;

    }

    @Override
    public void onStop() {
        super.onStop();
    }

}
