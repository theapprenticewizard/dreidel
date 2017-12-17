package io.dreidel.dreidel.model;

import java.util.Random;
import java.util.Stack;


public class Game {
    private Stack<Spin> dreidelSpinStack;

    public Game() {
        dreidelSpinStack = new Stack<>();
    }

    public Spin spin() {
        Spin spin = new Spin(getRandom());
        dreidelSpinStack.push(spin);
        return spin;
    }

    private int getRandom() {
        Random random = new Random();
        return random.nextInt(4);
    }
}
