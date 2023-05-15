package com.alonkrasne.BaseballData.exception;

public class PlayerNotFoundException extends RuntimeException {
    private static final String idNotFound = "Player with id %s not found";

    public PlayerNotFoundException(String id) {
        super(String.format(idNotFound, id));
    }
}
