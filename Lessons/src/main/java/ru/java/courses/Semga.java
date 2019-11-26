package ru.java.courses;

import java.util.Date;

public class Semga extends Fish{

   public final static int SROK = 2;

    @Override
    int getCena() {
        return 100000;
    }

    @Override
    Date getSrok() {
        return new Date(); // ???????????????????
    }
}
