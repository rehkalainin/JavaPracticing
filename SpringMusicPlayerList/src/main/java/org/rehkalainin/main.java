package org.rehkalainin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer player = context.getBean("musicPlayer",MusicPlayer.class);

        for(int i=0; i<4;i++) {

            player.playMusic(MusicGenre.ROCK);
            player.playMusic(MusicGenre.CLASSICAL);
            System.out.println(" ");
        }
        context.close();
    }
}
