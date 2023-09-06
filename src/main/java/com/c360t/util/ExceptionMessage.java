package com.c360t.util;

public final class ExceptionMessage {
    private ExceptionMessage() {
    }

    public static final String INVALID_PLAYER_ID = "Player ID cannot be smaller than 1.";
    public static final String NULL_OR_BLANK_PLAYER_NAME = "Player name cannot be null or blank.";
    public static final String NULL_PLAYER_TYPE = "Player type cannot be null.";
    public static final String NULL_PLAYER = "Player cannot be null.";
    public static final String NULL_OR_EMPTY_MESSAGE_PAYLOAD = "Message payload cannot be null or empty.";
    public static final String NULL_MESSAGE_SENDER_OR_RECEIVER = "Message sender or receiver cannot be null.";
    public static final String NULL_MESSAGE_PAYLOAD = "Message payload cannot be null.";
}
