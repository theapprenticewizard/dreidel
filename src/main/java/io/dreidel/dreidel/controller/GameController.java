package io.dreidel.dreidel.controller;

import io.dreidel.dreidel.application.GameService;
import io.dreidel.dreidel.application.data.GameState;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/play")
    @ResponseBody
    public GameState playRound() {
        return gameService.play();
    }
}
