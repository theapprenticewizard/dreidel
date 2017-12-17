package io.dreidel.dreidel.application;

import io.dreidel.dreidel.application.data.GameState;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    private final GameSessionFactory gameSessionFactory;

    public GameServiceImpl(GameSessionFactory gameSessionFactory) {
        this.gameSessionFactory = gameSessionFactory;
    }

    public GameState play() {
        GameSession gameSession = gameSessionFactory.gameSession();
        return gameSession.play();
    }
}
