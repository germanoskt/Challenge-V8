import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

class GameTest {
    @Test
    @DisplayName("The port cannot be null")
    void doorCannotBeNull() {
        Random random = new Random();

        random.setSeed(1);

        Boolean[] result = TesteJogo.createGame(random);
        
        Assertions.assertFalse(result[0], "Usuário não deveria trocar a porta.");
        Assertions.assertFalse(result[1], "Usuário não deveria ter ganho.");
    }

    @Test
    @DisplayName("The port cannot be null")
    void doorCannotBeNull2() {
        Random random = new Random();

        random.setSeed(2);

        Boolean[] result = TesteJogo.createGame(random);

        Assertions.assertFalse(result[0], "Usuário não deveria trocar a porta.");
        Assertions.assertTrue(result[1], "Usuário deveria ter ganho.");
    }
    @Test
    @DisplayName("The port cannot be null")
    void doorCannotBeNull3() {
        Random random = new Random();

        random.setSeed(6);

        Boolean[] result = TesteJogo.createGame(random);

        Assertions.assertTrue(result[0], "Usuário deveria trocar a porta.");
        Assertions.assertFalse(result[1], "Usuário não deveria ter ganho.");
    }

    @Test
    @DisplayName("The port cannot be null")
    void doorCannotBeNull4() {
        Random random = new Random();

        random.setSeed(10);

        Boolean[] result = TesteJogo.createGame(random);

        Assertions.assertFalse(result[0], "Usuário não deveria trocar a porta.");
        Assertions.assertTrue(result[1], "Usuário deveria ter ganho.");
    }

    @Test
    @DisplayName("The port cannot be null")
    void doorCannotBeNull5() {
        Random random = new Random();

        random.setSeed(10);

        Boolean[] result = TesteJogo.createGame(random);

        Assertions.assertFalse(result[0], "Usuário não deveria trocar a porta.");
        Assertions.assertTrue(result[1], "Usuário deveria ter ganho.");
    }
}