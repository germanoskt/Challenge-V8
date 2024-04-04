import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;

import static java.io.FileDescriptor.out;
import static org.junit.jupiter.api.Assertions.assertEquals;


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


        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        TesteJogo.main(new String[]{"10"});

        double saidaEsperada = (60.0);


        String epa = "As chances de não trocar é de";
        String[] lines = baos.toString().split(epa);
        String saidaRecebida = (lines[0]);

        assertEquals(saidaEsperada, saidaRecebida);
        Assertions.assertEquals(saidaEsperada, saidaRecebida);
    }

}
