import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import lombok.ToString;

@ToString
public class User {

  Random random;

  int chooseDoor(int numberOfChoices) {
    return  random.nextInt(0, numberOfChoices);
  }

  public User(Random random) {
    this.random = random;
  }

  public User () {
    this(new Random());
  }

}
