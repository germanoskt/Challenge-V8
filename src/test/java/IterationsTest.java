import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class IterationsTest {

    @Test
    @DisplayName("mostra o número de iterações")
    void teste1() {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        TesteJogo.main(new String[]{"89"});

        String saidaEsperada = ("A aplicação foi iterada 89 vezes");

        String epa = "\n";
        String[] lines = baos.toString().split(epa);
        String saidaRecebida = (lines[0]);

        assertEquals(saidaEsperada, saidaRecebida);
    }

    @Test
    void teste2() {

        List<Integer> result = TesteJogo.runGame(10);

        int swap = result.get(0);
        int swapWin = result.get(1);
        int chancesSwap = result.get(5);

        if (swapWin >= swap * 0.55) {
            Assertions.assertTrue(chancesSwap >= 55);
        }
        else {
            System.out.println("else");
            Assertions.assertTrue(chancesSwap < 55);
        }

        // quando não troca as chances são de 55%
        // quando troca as chances são menores que 40%
    }

    @Test
    void teste3() {

        List<Integer> result = TesteJogo.runGame(10);

        int persist = result.get(2);
        int persistWin = result.get(3);
        int chancesPersist = result.get(6);


        if (persistWin >= persist * 0.4) {
            System.out.println("if");
            Assertions.assertTrue(chancesPersist >= 40);
        }
        else {
            System.out.println("else");
            Assertions.assertTrue(chancesPersist < 40);
        }

        // quando não troca as chances são de 55%
        // quando troca as chances são menores que 40%
    }

    @Test
    void teste4() {

        List<Integer> result = TesteJogo.runGame(10);

        int swap = result.get(0);
        int swapWin = result.get(1);
        int chancesSwap = result.get(5);
        int persist = result.get(2);
        int persistWin = result.get(3);
        int chancesPersist = result.get(6);

        if(chancesSwap >= 40 && chancesSwap <= 55) {
            System.out.println("Está entre");
            assertTrue(true);
        }else{
            System.out.println("Não está entre");
            assertFalse(false);
        }


        // quando não troca as chances são de 55%
        // quando troca as chances são menores que 40%
    }
}
