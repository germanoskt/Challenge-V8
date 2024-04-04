import java.util.concurrent.ThreadLocalRandom;

public class TesteJogo {

  public static void main(String[] args) {

    int numberOfGames;

    try {
      numberOfGames = Integer.parseInt(args[0]);
    }
    catch (RuntimeException e){
      numberOfGames = 10;
    }

    int swap = 0;
    int swapWin = 0;
    int persist = 0;
    int persistWin = 0;
    int win = 0;

    for (int i = 0; i < numberOfGames; i++) {

      Boolean prize1 = ThreadLocalRandom.current().nextBoolean();
      Boolean prize2 = false;
      Boolean prize3 = false;

      if (!prize1) {
        prize2 = ThreadLocalRandom.current().nextBoolean();
      }
      if (!prize2 && !prize1) {
        prize3 = true;
      }
      Game game = new Game(new Door(prize1, 1),
              new Door(prize2, 2),
              new Door(prize3, 3),
              new User());

      Boolean[] result = game.start();

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

    System.out.printf("a aplicação foi iterada %d vezes\n", numberOfGames);

    System.out.printf("""
         Ele trocou %d vezes
         Ele não trocou %d vezes
         Ele ganhou %d vezes
         Ele perdeu %d vezes \n
         """, swap, persist, win, (numberOfGames - win));

    System.out.printf("""
          Das %d vezes que ele trocou de porta, ele venceu %d vezes e perdeu %d
           Das %d vezes que ele não trocou de porta, ele venceu %d e perdeu %d \n
          """, swap, swapWin, (swap - swapWin), persist, persistWin, (persist - persistWin));

    double chancesSwap = (swapWin * 100.0) / swap;
    double chancesPersist = (persistWin * 100.0) / persist;

    System.out.printf("""
           As chances de vencer trocando é de %.2f%% e as chances de perder são de %.2f%%
           As chances de vencer não trocando é de %.2f%% e as chances de perder são de %.2f%%
           """, chancesSwap, (100 - chancesSwap), chancesPersist, (100 - chancesPersist));
  }
}
