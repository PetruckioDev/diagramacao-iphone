package iphone.music.player;

import iphone.music.Music;

public interface MusicPlayer {

    void play();

    void pause();

    void selectMusic(Music music);
}
