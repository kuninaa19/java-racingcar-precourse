package racingcar.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameTest {
    private Game game;

    @BeforeEach
    void setUp() {
        this.game = new Game();
    }

    @Test
    void 게임_시작시_게임상태_시작() {
        game.play();

        assertThat(game.getStatus()).isEqualTo(GameStatus.PLAY);
    }

    @Test
    void 게임_종료시_게임상태_종료() {
        game.end();

        assertThat(game.getStatus()).isEqualTo(GameStatus.END);
    }
}
