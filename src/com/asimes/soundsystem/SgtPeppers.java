package com.asimes.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by Asimes on 2016/11/14.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
