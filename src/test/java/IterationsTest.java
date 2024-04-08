import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;


class IterationsTest {

    @Test
    @DisplayName("Cenário com 10.000")
    void teste1() {
        Random random = new Random();

        List<Integer> result = new TesteJogo(random).runGame(10000);

        int chancesSwap = result.get(5);
        int chancesPersist = result.get(6);

        Assertions.assertTrue(chancesPersist <= 11);
        Assertions.assertTrue(chancesSwap >= 10);
    }

    @Test
    @DisplayName("Cenário com 1.000")
    void teste2() {
        Random random = new Random();

        List<Integer> result = new TesteJogo(random).runGame(10000);

        int chancesSwap = result.get(5);
        int chancesPersist = result.get(6);

        Assertions.assertTrue(chancesPersist <= 13);
        Assertions.assertTrue(chancesSwap >= 9);
    }
    @Test
    @DisplayName("Cenário com 100")
    void teste3() {
        Random random = new Random();

        List<Integer> result = new TesteJogo(random).runGame(10000);

        int chancesSwap = result.get(5);
        int chancesPersist = result.get(6);

        Assertions.assertTrue(chancesPersist <= 50);
        Assertions.assertTrue(chancesSwap >= 4);
    }
}
