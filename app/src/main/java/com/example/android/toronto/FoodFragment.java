package com.example.android.toronto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);

        final ArrayList<Details> details = new ArrayList<Details>();

        details.add(new Details("Madrina Bar Y Tapas", "2 Trinity St, Toronto", R.drawable.food_madrina));
        details.add(new Details("Alo Restaurant", "163 Spadina Ave | 3rd Floor, Toronto", R.drawable.food_alo));
        details.add(new Details("Richmond Station", "1 Richmond St. West, Toronto", R.drawable.food_richmond));
        details.add(new Details("Michael's on Simcoe", "100 Simcoe St, Toronto", R.drawable.food_michael_steak));
        details.add(new Details("Scaramouche Restaurant", "1 Benvenuto Pl, Toronto", R.drawable.food_scaramouche_restaurant));


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
