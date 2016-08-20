package com.bignerdranch.android.criminalintent.controllers;

import android.support.v4.app.Fragment;

import com.bignerdranch.android.criminalintent.abstracts.SingleFragmentActivity;

/**
 * Created by Warlock Aleks on 20.08.2016.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
