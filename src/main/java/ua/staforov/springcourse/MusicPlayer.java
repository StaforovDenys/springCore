package ua.staforov.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    private Music music;
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }


    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusicList() {
        for (Music m : musicList) {
            System.out.println("Playing: " + m.getSong());
        }
    }
    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "musicList=" + musicList +
                ", music=" + music +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
