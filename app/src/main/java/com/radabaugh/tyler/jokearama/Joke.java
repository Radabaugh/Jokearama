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

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean isViewed() {
        return mViewed;
    }

    public void setViewed(boolean viewed) {
        mViewed = viewed;
    }
}
