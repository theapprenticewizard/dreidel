package io.dreidel.dreidel.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.*;

@Getter
@NoArgsConstructor
// aggregate root
public class Game {
    private Stack<Spin> dreidelSpinStack;
    private Set<Player> playerSet;

    // delete me
    private int coins = 10;

    private Player player = new Player();

    @Min(value = 2, message = "a game must have at least 2 players")
    @Max(value = 6, message = "a game can have no more than 6 players")
    public Game(int players) {
        dreidelSpinStack = new Stack<>();
        playerSet = new LinkedHashSet<>();

        for (int i = 0; i < players; i++) {
            Player player = new Player();
            player.setGelt(10);
            player.setActive(true);
            player.setName(UUID.randomUUID().toString());
            playerSet.add(player); // TODO: take a whole player as a param instead
        }
    }

    public Spin spin() {
        Spin spin = new Spin(getRandom());
        dreidelSpinStack.push(spin);
        playerSet.forEach(
                player -> player.setGelt(player.getGelt() + 1) // TODO: enforce invariance
        );

        return spin;
    }

    public Set<Player> getPlayerSet() {
        return this.playerSet;
    }

    private int getRandom() {
        return new Random().nextInt(4);
    }
}
