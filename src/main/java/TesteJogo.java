import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TesteJogo {

    public static void main(String[] args) {

        int numberOfGames = 50;
        int switchWin = 0;
        int keepWin = 0;

        for (int i = 0; i < numberOfGames; i++) {

        int numberRandom = ThreadLocalRandom.current().nextInt(0, 3);
        System.out.println("O prêmio está na porta: " + (numberRandom + 1));

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
            Game game = new Game(new Door(prize1, 1),
                    new Door(prize2, 2),
                    new Door(prize3, 3),
                    new User());

        List<Boolean> result = game.start();

            if (result.get(1) && result.get(0)) {
                switchWin++;
                //ganhou e trocou de porta
            }
            if (result.get(1)){
                keepWin++;
            }
        }
        int probability = (switchWin * 100) / numberOfGames;
        int keepProbability = (keepWin * 100) / numberOfGames;

        System.out.println("A probabilidade de ganhar sem trocar de porta é: " + keepProbability + "%");
        System.out.println("A probabilidade de trocar de porta e ganhar é: " + probability + "%");
        System.out.println("Trocou de porta: " + switchWin + " vezes");
    }
}
