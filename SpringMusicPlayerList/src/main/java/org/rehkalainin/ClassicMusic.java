package org.rehkalainin;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicMusic implements Music {

    private List<String> songList = new ArrayList<>();

    {
        songList.add("Beethoven Symphony 5");
        songList.add("Mozart music");
        songList.add("Chopen music");
    }

    @Override
    public List<String> getSongs() {
        return songList;
    }
}
