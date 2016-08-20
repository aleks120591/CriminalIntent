package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

import com.bignerdranch.android.criminalintent.abstracts.SingleFragmentActivity;
import com.bignerdranch.android.criminalintent.fragment.CrimeFragment;

public class CrimeActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}