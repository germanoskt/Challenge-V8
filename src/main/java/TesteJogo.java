import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TesteJogo {

    public static void main(String[] args) {

        int numberRandom = ThreadLocalRandom.current().nextInt(0, 3);

        System.out.println("O prêmio está na porta " + numberRandom);

        boolean prize1 = false;
        boolean prize2 = false;
        boolean prize3 = false;

        if(numberRandom == 0) {
            prize1 = true;
        }else if (numberRandom == 1) {
            prize2 = true;
        }
        else {
            prize3 = true;
        }

        int numberOfGames = 3;
        double ganhou = 0;

        for (int i = 0; i < numberOfGames; i++) {
            Game game = new Game(new Door(prize1),
                    new Door(prize2),
                    new Door(prize3),
                    new User());

        List<Boolean> result = game.start();

            if (result.get(1) && result.get(0)) {
                ganhou++;
                //ganhou e trocou de porta
            }

        }

        // 2 = 100
        // 1 = x
        // 2x = 1*100
        // 2x = 100
        // x = 100/2

        Double probabilidade = (ganhou * 100) / numberOfGames;

        System.out.println("Quantidade de vezes que trocou e ganhou: " + ganhou);
        System.out.println("A probabilidade de trocar de porta é: " + probabilidade);
        System.out.println("Trocou de porta: " + ganhou + " vezes");

    }
}
