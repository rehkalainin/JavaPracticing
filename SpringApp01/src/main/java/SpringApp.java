

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args)
    {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "AplicationContext.xml"
        );
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer player = new MusicPlayer(music);

        MusicPlayer player = context.getBean("musicPlayerBean",MusicPlayer.class);
        player.playMusic();

        System.out.println("name: "+ player.getName());
        System.out.println("volume: "+player.getVolume());
        context.close();
    }

}
