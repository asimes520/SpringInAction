package com.asimes.beans;

/**
 * Created by Asimes on 2016/11/14.
 */
public class MockQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("Mock!");
    }
}
