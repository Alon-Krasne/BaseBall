package com.alonkrasne.BaseballData.service;

import com.alonkrasne.BaseballData.entity.Player;
import com.alonkrasne.BaseballData.exception.PlayerNotFoundException;
import com.alonkrasne.BaseballData.repository.PlayerRepository;
import com.alonkrasne.BaseballData.util.PlayerFileLoader;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Value("${player.csv.file.path}")
    private String playerCsvFilePath;

    public List<Player> getPlayers() {
        log.debug("Received request to get all players");
        return playerRepository.findAll();
    }

    public Player getPlayerById(String id) throws PlayerNotFoundException {
        log.debug("Received request to get player with id: {}", id);
        return playerRepository.findById(id)
                .orElseThrow(() -> new PlayerNotFoundException(id));
    }

    public void initDb() {
        log.info("Initializing database");
        try {
            List<Player> players = PlayerFileLoader.loadPlayerFile(playerCsvFilePath);
            playerRepository.saveAll(players);
            log.info("Database initialized with {} players", players.size());
        } catch (Exception e) {
            log.error("Error loading player file: {}\n\nExiting...", e.getMessage());
            throw new RuntimeException("Failed to load players file.");
        }
    }
}
