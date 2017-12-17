package io.dreidel.dreidel.application;

import io.dreidel.dreidel.model.Game;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("session")
public class GameService {
    private final Game game;

    public GameService(Game game) {
        this.game = game;
    }



}
