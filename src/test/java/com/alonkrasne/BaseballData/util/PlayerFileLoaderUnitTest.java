package com.alonkrasne.BaseballData.util;

import com.alonkrasne.BaseballData.entity.Player;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class PlayerFileLoaderUnitTest {

    @Test
    void loadOnePlayerFile() {
        try {
            List<Player> players = PlayerFileLoader.loadPlayerFile("one_player.csv");
            Player player = players.get(0);
            assertEquals(player.getNameFirst(), "David");
        } catch (IOException e) {
            fail("Exception thrown");
        }
    }

    @Test
    void loadCorruptFile() {
        try {
            List<Player> players = PlayerFileLoader.loadPlayerFile("corrupt.csv");
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "No players found in file");
        }
    }
}