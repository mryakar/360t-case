package com.c360t.player;

import com.c360t.util.ExceptionMessage;

public record Player(
        long id,
        String name,
        PlayerType type
) {

    public Player {
        if (id < 1) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_PLAYER_ID);
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(ExceptionMessage.NULL_OR_BLANK_PLAYER_NAME);
        }
        if (type == null) {
            throw new IllegalArgumentException(ExceptionMessage.NULL_PLAYER_TYPE);
        }
    }
}