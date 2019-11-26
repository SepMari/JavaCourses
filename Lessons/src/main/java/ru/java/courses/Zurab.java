package ru.java.courses;

import java.util.Date;

public class Zurab extends Fish {

    public final static int SROK = 2;

    @Override
    int getCena() {
        return 1000000;
    }

    @Override
    Date getSrok() {
        return new Date(); // ???????????????????
    }
}
