package com.example.android.toronto;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);

        final ArrayList<Details> details = new ArrayList<Details>();

        details.add(new Details("Vaughan Mills", "1 Bass Pro Mills Dr, Vaughan", R.drawable.shop_vaughan));
        details.add(new Details("Yorkville Village", "Bordered by Avenue Rd. | Yonge and Bloor Sts., and Yorkville Ave., Toronto", R.drawable.shop_yorkville_village));
        details.add(new Details("Toronto Eaton Centre", "Toronto Eaton Centre Gallery 220 Yonge St Suite 110, Toronto", R.drawable.shop_cf_toronto_eaton_centre));
        details.add(new Details("Square One Shopping Centre", "Square One 100 City Centre Dr, Mississauga", R.drawable.shop_square_one_shopping));
        details.add(new Details("Yorkdale Shopping Centre", "3401 Dufferin Street, Toronto", R.drawable.shop_yorkdale_shopping));


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
