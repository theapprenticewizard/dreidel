package io.dreidel.dreidel.application;

import io.dreidel.dreidel.model.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class GameConfiguration {

    @Bean
    @Scope("session")
    public Game game() {
        return new Game();
    }
}
