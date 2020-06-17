package ua.staforov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext"
        );

//        Music music = context.getBean("rockMusic",Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();
//
//        Music music1 = context.getBean("classicalMusic",Music.class);
//
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//
//        musicPlayer1.playMusic();

        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);


//        Computer computer = context.getBean("computer",Computer.class);
//        System.out.println(computer);
        context.close();
    }
}
