package com.example.sarapavas.santaelena;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Sara Pavas on 24/04/2016.
 */
public class PagerAdapter extends FragmentPagerAdapter{

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new Turismo2Fragment();
            case 1: return new Turismo1Fragment();
            case 2: return new Turismo3Fragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
