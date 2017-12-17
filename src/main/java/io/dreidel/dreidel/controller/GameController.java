package io.dreidel.dreidel.controller;

import io.dreidel.dreidel.model.Game;
import io.dreidel.dreidel.model.Spin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameController {

    @GetMapping("/play")
    @ResponseBody
    public Spin playRound() {
        return new Game(2).spin();
    }
}
