package io.dreidel.dreidel.application;

import io.dreidel.dreidel.application.data.GameState;
import io.dreidel.dreidel.model.Game;
import io.dreidel.dreidel.model.GameFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class GameSessionImpl implements GameSession {
    private final GameFactory gameFactory;
    private final Game game;

    public GameSessionImpl(GameFactory gameFactory) {
        this.gameFactory = gameFactory;
        this.game = gameFactory.createGame(2);
    }

    @Override
    public GameState play() {
        return createGameState();
    }

    // TODO: this may need to be an abstract factory rather than a method factory
    private GameState createGameState() {
        GameState gameState = new GameState();
        gameState.setSpin(game.spin());
        gameState.setPlayers(game.getPlayerSet());
        return gameState;
    }
}
