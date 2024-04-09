import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;


class IterationsTest {

    @Test
    @DisplayName("Cenário com 10.000")
    void teste1() {
        Random random = new Random();

        List<Integer> result = new TesteJogo(random).runGame(10000, 3);

        int chancesSwap = result.get(5);
        int chancesPersist = result.get(6);

        Assertions.assertTrue(chancesPersist <= 33);
        Assertions.assertTrue(chancesSwap >= 66);
    }

    @Test
    @DisplayName("Cenário com 1.000")
    void teste2() {
        Random random = new Random();

        List<Integer> result = new TesteJogo(random).runGame(1000, 4);

        int chancesSwap = result.get(5);
        int chancesPersist = result.get(6);


        System.out.println(chancesPersist);
        System.out.println(chancesSwap);

        Assertions.assertTrue(chancesPersist <= 26);
        Assertions.assertTrue(chancesSwap >= 39);

    }
    @Test
    @DisplayName("Cenário com 10.000")
    void teste3() {
        Random random = new Random();

        List<Integer> result = new TesteJogo(random).runGame(10000, 10);

        int chancesSwap = result.get(5);
        int chancesPersist = result.get(6);

        System.out.println(chancesPersist);
        System.out.println(chancesSwap);

        Assertions.assertTrue(chancesPersist <= 10);
        Assertions.assertTrue(chancesSwap >= 11);
    }
    // espaço amostral - total de possibilidades possiveis
}
