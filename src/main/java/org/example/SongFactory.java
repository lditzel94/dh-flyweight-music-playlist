package org.example;

import java.util.HashMap;
import java.util.function.Function;

public class SongFactory {

    private static HashMap<String, Song> songsByName = new HashMap<>();

    public static Song getSongBy( String name, String artist, String genre ) {
        return songsByName.computeIfAbsent( name, registerSongFor( artist, genre ) );
    }

    private static Function<String, Song> registerSongFor( String artist, String genre ) {
        return ( name ) -> Song.builder()
                               .name( name )
                               .artist( artist )
                               .genre( genre )
                               .build();
    }
}
