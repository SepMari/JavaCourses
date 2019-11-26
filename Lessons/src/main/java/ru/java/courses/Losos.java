package ru.java.courses;

import java.util.Date;

public class Losos extends Fish {
    public final static int SROK = 2;

    @Override
    int getCena() {
        return 200;
    }

    @Override
    Date getSrok() {
        return new Date(); // ???????????????
    }
}
