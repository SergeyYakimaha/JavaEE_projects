package ru.alishev.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music {
    private List<String> listRockMusic = new ArrayList<>(Arrays.asList("rockSong_1", "rockSong_2", "rockSong_3"));

    @Override
    public List<String> getSongs() {
        return listRockMusic;
    }
}
