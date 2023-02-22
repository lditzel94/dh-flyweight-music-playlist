package org.example;

import lombok.Builder;

@Builder
public record Song(
        String name,
        String artist,
        String genre
) {
}
