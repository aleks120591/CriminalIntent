package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Warlock on 24.08.2016.
 */

public class CrimeActivity extends FragmentActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);
    }
}
