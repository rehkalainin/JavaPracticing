package org.rehkalainin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("classicMusic")
    private Music classicalMusic;

    @Autowired
    @Qualifier("rockMusic")
    private Music rockMusic;

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL)
        {
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        }
        else
            {
                System.out.println(rockMusic.getSongs().get(randomNumber));
            }
    }


}
