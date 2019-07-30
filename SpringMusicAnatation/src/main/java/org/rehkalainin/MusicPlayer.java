package org.rehkalainin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("classicMusic")
    private Music music1;

    @Autowired
    @Qualifier("rockMusic")
    private Music music2;

    public String playMusic(){
    return "Playin: "+ music1.getSong()+ " "+music2.getSong();
    }


}
