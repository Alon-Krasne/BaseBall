package com.alonkrasne.BaseballData.exception;

public class PlayerNotFoundException extends RuntimeException {
    private static final String ID_NOT_FOUND = "Player with id %s not found";

    public PlayerNotFoundException(String id) {
        super(String.format(ID_NOT_FOUND, id));
    }
}
