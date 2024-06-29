package dev.sdachess.spotifywatcher.validation;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CurrentSongInfo {
    public String title;
    public String artist;
    public String album;
    public String imageUrl;
    public boolean isPlaying;
    public int progress;
}
