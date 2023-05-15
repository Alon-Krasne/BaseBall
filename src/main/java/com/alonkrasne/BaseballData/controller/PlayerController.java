package com.alonkrasne.BaseballData.controller;


import com.alonkrasne.BaseballData.entity.Player;
import com.alonkrasne.BaseballData.service.PlayerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/players")
@Slf4j
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;

    @GetMapping
    public List<Player> getPlayers(@RequestParam(defaultValue = "0") int pageNumber,
                                   @RequestParam(defaultValue = "10") int pageSize) {
        log.debug("Received request to get all players with pageNumber: {} and pageSize: {}", pageNumber, pageSize);
        return playerService.getPlayers(pageNumber, pageSize);
    }

    @GetMapping("/{id}")
    public Player getPlayer(@PathVariable("id") String id) {
        log.debug("Received request to get player with id: {}", id);
        return playerService.getPlayerById(id);
    }
}
