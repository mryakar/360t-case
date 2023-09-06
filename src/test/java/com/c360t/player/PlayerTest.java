package com.c360t.player;

import com.c360t.util.ExceptionMessage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PlayerTest {

    @DisplayName("Test creating player with an invalid player id")
    @Test
    void invalidPlayerId_newPlayer_throwsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Player(0L, "Player", PlayerType.INITIATOR)
        );
        assertEquals(ExceptionMessage.INVALID_PLAYER_ID, exception.getMessage());
    }

    @DisplayName("Test creating player with a null player name")
    @Test
    void nullPlayerName_newPlayer_throwsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Player(1L, null, PlayerType.INITIATOR)
        );
        assertEquals(ExceptionMessage.NULL_OR_BLANK_PLAYER_NAME, exception.getMessage());
    }

    @DisplayName("Test creating player with a blank player name")
    @Test
    void blankPlayerName_newPlayer_throwsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Player(1L, " ", PlayerType.INITIATOR)
        );
        assertEquals(ExceptionMessage.NULL_OR_BLANK_PLAYER_NAME, exception.getMessage());
    }

    @DisplayName("Test creating player with a null player type")
    @Test
    void nullPlayerType_newPlayer_throwsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Player(1L, "Player", null)
        );
        assertEquals(ExceptionMessage.NULL_PLAYER_TYPE, exception.getMessage());
    }
}
