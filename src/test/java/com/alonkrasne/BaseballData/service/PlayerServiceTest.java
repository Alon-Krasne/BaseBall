package com.alonkrasne.BaseballData.service;

import com.alonkrasne.BaseballData.entity.Player;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class PlayerServiceTest {

    @Autowired
    private PlayerService playerService;

    @Test
    void initDbHappyPath() {
        ReflectionTestUtils.setField(playerService, "playerCsvFilePath", "one_player.csv");
        playerService.initDb();
        List<Player> players = playerService.getPlayers(0, 10);
        assertEquals(players.size(), 1);
    }

    @Test
    void initDbFileNotFound() {
        ReflectionTestUtils.setField(playerService, "playerCsvFilePath", "test2.csv");
        assertThrows(RuntimeException.class, () -> {
            playerService.initDb();
        });
    }
}