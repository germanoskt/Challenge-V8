import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TesteJogo {

    public static void main(String[] args) {

        int numberRandom = ThreadLocalRandom.current().nextInt(0, 3);

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

//        Random rd = new Random();
//        boolean prize4 = rd.nextBoolean();








        for (int i = 0; i < 1000; i++) {
            Game game = new Game(new Door(prize1),
                    new Door(prize2),
                    new Door(prize3),
                    new User());
        System.out.println(game);
        game.start();
        }

    }
}
