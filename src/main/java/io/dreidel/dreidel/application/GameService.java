package io.dreidel.dreidel.application;

import org.springframework.stereotype.Service;

@Service
public class GameService {

    private final GameSessionFactory gameSessionFactory;

    public GameService(GameSessionFactory gameSessionFactory) {
        this.gameSessionFactory = gameSessionFactory;
    }


}
