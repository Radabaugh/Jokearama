package com.radabaugh.tyler.jokearama;

import android.support.v4.app.Fragment;

/**
 * Created by Tyler Radabaugh on 11/1/2017.
 */

public class JokeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new JokeFragment();
    }
}
