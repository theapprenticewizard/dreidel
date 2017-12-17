package io.dreidel.dreidel.application.data;

import io.dreidel.dreidel.model.Player;
import io.dreidel.dreidel.model.Spin;
import lombok.Data;

import java.util.Set;

@Data
public class GameState {
    private Spin spin;
    private Set<Player> players;
}
