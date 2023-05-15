package com.alonkrasne.BaseballData.controller;


import com.alonkrasne.BaseballData.entity.Player;
import com.alonkrasne.BaseballData.service.PlayerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/player")
@Slf4j
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;

    @GetMapping
    public List<Player> getPlayers() {
        log.debug("Received request to get all players");
        return playerService.getPlayers();
    }

    @GetMapping("/{id}")
    public Player getPlayer(@PathVariable("id") String id) {
        log.debug("Received request to get player with id: {}", id);
        return playerService.getPlayerById(id);
    }
}
