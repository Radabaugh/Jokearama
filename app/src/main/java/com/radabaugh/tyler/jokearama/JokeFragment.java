package com.radabaugh.tyler.jokearama;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_joke, container, false);
        return v;
    }
}
