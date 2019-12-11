package ru.alishev.springcource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetalMusic implements Music {
    private List<String> listMetalMusic;

    public MetalMusic(List<String> stringList) {
        this.listMetalMusic = stringList;
    }

    @Override
    public List<String> getSongs() {
        return listMetalMusic;
    }
}
