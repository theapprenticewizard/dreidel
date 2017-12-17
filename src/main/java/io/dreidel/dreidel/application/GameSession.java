package io.dreidel.dreidel.application;

import io.dreidel.dreidel.model.Game;
import io.dreidel.dreidel.model.GameFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class GameSession {
    private final GameFactory gameFactory;
    private final Game game;

    public GameSession(GameFactory gameFactory) {
        this.gameFactory = gameFactory;
        this.game = gameFactory.createGame(2);
    }
}
