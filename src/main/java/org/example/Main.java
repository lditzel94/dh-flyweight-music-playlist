package org.example;

public class Main {
    public static void main( String[] args ) {
        var playlist = new Playlist( "demo" );
        playlist.addSongBy(
                "american idiot",
                "green day",
                "punk" );
        playlist.display();
    }
}