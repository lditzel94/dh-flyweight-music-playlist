package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlaylistTest {

    @Test
    @DisplayName( "Should successfully add song" )
    void addSongBy() {
        var playlist = new Playlist( "demo" );
        playlist.addSongBy(
                "american idiot",
                "green day",
                "punk" );


        assertTrue( playlist.getSongs().containsKey( "american idiot" ) );
    }

    @Test
    @DisplayName( "Should delete song by name" )
    void deleteSongBy() {
        var playlist = new Playlist( "demo" );

        playlist.addSongBy(
                "american idiot",
                "green day",
                "punk" );
        playlist.deleteSongBy( "american idiot" );

        assertFalse( playlist.getSongs().containsKey( "american idiot" ) );
    }
}