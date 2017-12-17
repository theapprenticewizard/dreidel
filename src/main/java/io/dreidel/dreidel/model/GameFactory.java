package io.dreidel.dreidel.model;

import org.springframework.stereotype.Component;

@Component
public class GameFactory {

    // perhaps maybe instantiate a game with multiple sets of players
    public Game createGame(int numberOfPlayers) {
        return new Game(numberOfPlayers);
    }
}
