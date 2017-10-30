package com.radabaugh.tyler.jokearama;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Tyler Radabaugh on 10/30/2017.
 */

public class JokeBook {
    private static JokeBook sJokeBook;

    private List<Joke> mJokes;

    public static JokeBook get(Context context) {
        if (sJokeBook == null) {
            sJokeBook = new JokeBook(context);
        }
        return sJokeBook;
    }

    private JokeBook(Context context) {
        mJokes = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Joke joke = new Joke();
            joke.setTitle("Joke " + i);
            joke.setViewed(false);
            mJokes.add(joke);
        }
    }

    public List<Joke> getJokes() {
        return mJokes;
    }

    public Joke getJoke(UUID id) {
        for (Joke joke : mJokes) {
            if (joke.getId().equals(id)) {
                return joke;
            }
        }
        return null;
    }
}
