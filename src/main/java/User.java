import lombok.ToString;

import java.util.concurrent.ThreadLocalRandom;
@ToString
public class User {

    int chooseDoor () {
        return ThreadLocalRandom
                .current()
                .nextInt(0, 3);
    }

}
