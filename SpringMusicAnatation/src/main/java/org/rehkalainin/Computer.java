package org.rehkalainin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Autowired
    private MusicPlayer player;

    public Computer(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "Computer " + " "+ player.playMusic();
    }
}
