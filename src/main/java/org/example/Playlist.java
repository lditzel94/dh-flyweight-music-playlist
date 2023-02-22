package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.example.SongFactory.getSongBy;


public class Playlist {

    private final String name;
    private final Map<String, Song> songs = new HashMap<>();

    public Playlist( String name ) {
        this.name = name;
    }

    public Map<String, Song> getSongs() {
        return songs;
    }

    public Song addSongBy( String name, String artist, String genre ) {
        return songs.put( name, getSongBy( name, artist, genre ) );
    }

    public void deleteSongBy( String name ) throws NoSuchElementException {
        Optional.ofNullable( songs.remove( name ) )
                .orElseThrow( NoSuchElementException::new );
    }

    public void display() {
        songs.values().forEach( System.out::println );
    }
}
