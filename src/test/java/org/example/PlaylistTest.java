package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    @DisplayName( "Should throw exception when song does not exist" )
    void deleteSongWithThrow() {
        var playlist = new Playlist( "demo" );

        assertThrows( NoSuchElementException.class, () -> playlist.deleteSongBy( "american idiot" ) );
    }

}