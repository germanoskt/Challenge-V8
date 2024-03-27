import lombok.ToString;

import java.util.concurrent.ThreadLocalRandom;
@ToString
public class Game {
    Door door1;
    Door door2;
    Door door3;
    User user;


    public Game(Door door1, Door door2, Door door3, User user) {
        this.door1 = door1;
        this.door2 = door2;
        this.door3 = door3;
        this.user = user;
    }


    public void start () {
        int doorChoosed = user.chooseDoor();

        

    }





    Integer quantidadeDePortas = 3;

    Integer premio = ThreadLocalRandom.current().nextInt(1, 4);

    void adivinhar (Integer numeroAdivinha) {

        for (int i = 0; i < 3; i++) {

        }

    }

}
