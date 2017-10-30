package com.radabaugh.tyler.jokearama;

import android.content.Context;

/**
 * Created by Tyler Radabaugh on 10/30/2017.
 */

public class JokeBook {
    private static JokeBook sJokeBook;

    public static JokeBook get(Context context) {
        if (sJokeBook == null) {
            sJokeBook = new JokeBook(context);
        }
        return sJokeBook;
    }

    private JokeBook(Context context) {

    }
}
