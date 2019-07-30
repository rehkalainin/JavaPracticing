package org.rehkalainin;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songsList= new ArrayList<>();
    {
        songsList.add("Show must go on!");
        songsList.add("Nothing else metall");
        songsList.add("Final countdown");
    }

    @Override
    public List<String> getSongs() {

        return songsList;
    }
}
