package com.radabaugh.tyler.jokearama;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by Tyler Radabaugh on 10/30/2017.
 */

public class JokeFragment extends Fragment {
    private Joke mJoke;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mJoke = new Joke();
    }
}
