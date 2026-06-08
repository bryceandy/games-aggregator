package com.dag.gamesaggregator;

import org.springframework.boot.SpringApplication;

public class TestGamesAggregatorApplication {

  public static void main(String[] args) {
    SpringApplication.from(GamesAggregatorApplication::main)
        .with(TestcontainersConfiguration.class)
        .run(args);
  }
}
