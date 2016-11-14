package com.asimes.beans;

import java.io.PrintStream;

/**
 * Created by Asimes on 2016/11/14.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream printStream) {
        this.stream = printStream;
    }

    @Override
    public void embark() {
        stream.print("Embarking on quest to slay the dragon!");
    }
}
