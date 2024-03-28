import lombok.ToString;

import java.util.concurrent.ThreadLocalRandom;
@ToString
public class User {

    int chooseDoor (int numberChoosed) {
        return ThreadLocalRandom
                .current()
                .nextInt(0, numberChoosed);
    }
}
