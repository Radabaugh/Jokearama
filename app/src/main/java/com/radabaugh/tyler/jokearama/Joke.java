package com.radabaugh.tyler.jokearama;

import java.util.UUID;

/**
 * Created by Tyler Radabaugh on 10/30/2017.
 */

public class Joke {

    private UUID mId;
    private String mTitle;
    private boolean mViewed;

    public Joke() {
        mId = UUID.randomUUID();
    }
}
