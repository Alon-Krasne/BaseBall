package com.alonkrasne.BaseballData;

import com.alonkrasne.BaseballData.service.PlayerService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class BaseballDataServiceApplication {

	private final PlayerService playerService;

	public static void main(String[] args) {
		SpringApplication.run(BaseballDataServiceApplication.class, args);
	}

	@PostConstruct
	private void initPlayerDb() {
		playerService.initDb();
	}

}
