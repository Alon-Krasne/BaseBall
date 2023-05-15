package com.alonkrasne.BaseballData.util;

import com.alonkrasne.BaseballData.entity.Player;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class PlayerFileLoader {
    public static List<Player> loadPlayerFile(String filePath) throws IOException {
        Resource resource = new ClassPathResource(filePath);
        BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()));
        List<Player> players = new CsvToBeanBuilder<Player>(br)
                .withType(Player.class)
                .build()
                .parse();

        if (players.size() == 0) {
            throw new IOException("No players found in file");
        }
        return players;
    }
}
