package io.dreidel.dreidel.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

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
    }

    public Spin spin() {
        Spin spin = new Spin(getRandom());
        dreidelSpinStack.push(spin);
        return spin;
    }

    private int getRandom() {
        return new Random().nextInt(4);
    }
}
