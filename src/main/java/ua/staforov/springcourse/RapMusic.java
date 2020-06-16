package ua.staforov.springcourse;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }
    @Override
    public List<String> getSong() {
        return songs;
    }
}
