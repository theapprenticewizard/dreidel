package io.dreidel.dreidel.application;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class GameSessionFactory {

    private final ApplicationContext ctx;

    public GameSessionFactory(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    public GameSession gameSession() {
        return ctx.getBean(GameSession.class);
    }
}
