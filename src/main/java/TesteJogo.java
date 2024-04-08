import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TesteJogo {

    public static void main(String[] args) {

        int numberOfGames;

        try {
            numberOfGames = Integer.parseInt(args[0]);
        } catch (RuntimeException e) {
            numberOfGames = 10;
        }

        List<Integer> result = runGame(numberOfGames);

        int swap = result.get(0);
        int swapWin = result.get(1);
        int persist = result.get(2);
        int persistWin = result.get(3);
        int win = result.get(4);
        int chancesSwap = result.get(5);
        int chancesPersist = result.get(6);



        System.out.printf("A aplicação foi iterada %d vezes\n",numberOfGames);

        System.out.printf("""
                Ele trocou %d vezes
                Ele não trocou %d vezes
                Ele ganhou %d vezes
                Ele perdeu %d vezes \n
                """, swap, persist, win, (numberOfGames - win));

        System.out.printf("""
                Das %d vezes que ele trocou de porta, ele venceu %d vezes e perdeu %d
                Das %d vezes que ele não trocou de porta, ele venceu %d e perdeu %d
                """, swap, swapWin, (swap - swapWin), persist, persistWin, (persist - persistWin));

        System.out.printf(" As chances de vencer trocando é de %d%% e as chances de perder são de %d%%\n" +
                "As chances de vencer não trocando é de %d%% e as chances de perder são de %d%%\n", chancesSwap,
                (100 - chancesSwap),
                chancesPersist,
                (100 - chancesPersist));
    }


    public static Boolean[] createGame(Random random) {


            Boolean prize1 = random.nextBoolean();
            Boolean prize2 = false;
            Boolean prize3 = false;

            if (!prize1) {
                prize2 = random.nextBoolean();
            }
            if (!prize2 && !prize1) {
                prize3 = true;
            }
            Game game = new Game(new Door(prize1, 1),
                    new Door(prize2, 2),
                    new Door(prize3, 3),
                    new User(random));

            return game.start();
    }

    public static List<Integer> runGame(int numberOfGames) {

        int swap = 0;
        int swapWin = 0;
        int persist = 0;
        int persistWin = 0;
        int win = 0;

        for (int i = 0; i < numberOfGames; i++) {

            Random random = new Random();

            Boolean[] result = createGame(random);

            if (result[1]) {
                win++;
            }
            if (result[0]) {
                swap++;
                if (result[1]) {
                    swapWin++;
                }
            }
            if (!result[0]) {
                persist++;
                if (result[1]) {
                    persistWin++;
                }
            }
        }

        int chancesSwap = (swapWin * 100) / swap;
        int chancesPersist = (persistWin * 100) / persist;

        return Arrays.asList(swap,
                swapWin,
                persist,
                persistWin,
                win,
                chancesSwap,
                chancesPersist);
    }

}

