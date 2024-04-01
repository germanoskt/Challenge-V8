import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TesteJogo {

    public static void main(String[] args) {

        int numberOfGames = 1000000;

        int swap = 0;
        int swapWin = 0;
        int persist = 0;
        int persistWin = 0;
        int win = 0;

        for (int i = 0; i < numberOfGames; i++) {

            int numberRandom = ThreadLocalRandom.current().nextInt(0, 3);
//            System.out.println("O prêmio está na porta: " + (numberRandom + 1));

            boolean prize1 = false;
            boolean prize2 = false;
            boolean prize3 = false;

            if (numberRandom == 0) {
                prize1 = true;
            } else if (numberRandom == 1) {
                prize2 = true;
            } else {
                prize3 = true;
            }
            Game game = new Game(new Door(prize1, 1),
                    new Door(prize2, 2),
                    new Door(prize3, 3),
                    new User());

            List<Boolean> result = game.start();

            if (result.get(1)) {
                win++;
            }

            if (result.get(0)) {
                swap++;
                if (result.get(1)) {
                    swapWin++;
                }
            }
            if (!result.get(0)) {
                persist++;
                if (result.get(1)) {
                    persistWin++;
                }
            }
        }

            System.out.println("ele trocou " + swap + " vezes");
            System.out.println("ele não trocou " + persist + " vezes");
            System.out.println("ele ganhou " + win + " vezes");
            System.out.println("ele perdeu " + (numberOfGames - win) + " vezes");

            System.out.println("das " + swap + " vezes que ele trocou de porta, ele venceu " + swapWin + " vezes e perdeu " + (swap - swapWin));
            System.out.println("das " + persist + " vezes que ele não trocou de porta, ele venceu " + persistWin + " e perdeu " + (persist - persistWin));

            try{

                Double chancesSwap = (swapWin * 100.0) / swap;
                Double chancesPersist = (persistWin * 100.0) / persist;

                System.out.printf("as chances de vencer  trocando é de %.2f%% e as chances de perder são de %.2f%%", chancesSwap, (100 - chancesSwap));
                System.out.printf("\nas chances de vencer não trocando é de %.2f%% e as chances de perder são de %.2f%%", chancesPersist, (100 - chancesPersist));
            } catch (ArithmeticException e){
                System.out.println(e);
            }







    }
}
