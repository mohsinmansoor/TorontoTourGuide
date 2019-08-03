package com.example.android.toronto;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentAdapter (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();
        } else if (position == 1){
            return new ShoppingFragment();
        } else if (position == 2) {
            return new AttractionsFragment();
        }
        else {
            return new HotelFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.food_fragment);
        }

        else if (position == 1) {
            return mContext.getString(R.string.shopping_fragment);
        }
        else if (position == 2) {
            return mContext.getString(R.string.attractions_fragment);
        }

        else {
            return mContext.getString(R.string.hotel_fragment);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
