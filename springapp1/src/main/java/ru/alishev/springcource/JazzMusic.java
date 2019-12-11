package ru.alishev.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JazzMusic implements Music {
    private List<String> listClassicalMusic = new ArrayList<>(Arrays.asList("jazzSong_1", "jazzSong_2", "jazzSong_3"));

    @Override
    public List<String> getSongs() {
        return listClassicalMusic;
    }
}
