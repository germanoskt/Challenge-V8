import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import lombok.ToString;

@ToString
public class User {

  Random random;

  int chooseDoor(int numberChoosed) {
    return  random.nextInt(0, numberChoosed);
  }

  public User(Random random) {
    this.random = random;
  }

  public User () {
    this(new Random());
  }

}
