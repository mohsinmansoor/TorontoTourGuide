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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);

        final ArrayList<Details> details = new ArrayList<Details>();

        details.add(new Details("Toronto Island Park", "9 Queens Quay West | Bay Street, Jack Layton Ferry Terminal, Toronto", R.drawable.att_island));
        details.add(new Details("Ripley's Aquarium Of Canada", "288 Bremner Boulevard, Toronto", R.drawable.att_ripley_s_aquarium));
        details.add(new Details("CN Tower - Toronto", "290 Bremner Blvd, Toronto", R.drawable.att_cn_tower));
        details.add(new Details("Hockey Hall of Fame", "Brookfield Place - Concourse Level | 30 Yonge Street, Toronto", R.drawable.att_outside_of_hockey_hall));
        details.add(new Details("Distillery Historic District", "55 Mill St, Toronto", R.drawable.att_distillery_art));


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
