import java.util.concurrent.ThreadLocalRandom;
import lombok.ToString;

@ToString
public class User {

  int chooseDoor(int numberChoosed) {
    return ThreadLocalRandom
            .current()
            .nextInt(0, numberChoosed);
  }
}
