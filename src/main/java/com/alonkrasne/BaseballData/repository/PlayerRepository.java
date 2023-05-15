package com.alonkrasne.BaseballData.repository;

import com.alonkrasne.BaseballData.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, String> {

}
