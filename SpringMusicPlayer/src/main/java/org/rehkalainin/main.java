package org.rehkalainin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");


        ClassicMusic classicMusic = context.getBean("musicBean", ClassicMusic.class);
        System.out.println(classicMusic.getSong());
     /*   MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer player2 = context.getBean("musicPlayer", MusicPlayer.class);


        System.out.println(player1);
        System.out.println(player2);

        player1.setVolume(10);
        player2.setVolume(20);
        System.out.println("volume1: "+ player1.getVolume());
        System.out.println("volume2: "+ player2.getVolume());

      */
        context.close();
    }
}
