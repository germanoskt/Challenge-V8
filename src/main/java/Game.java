import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Random;

@Getter
@Setter
@ToString
public class Game {

    List<Door> doors;
    User user;

    public Game(List<Door> doors, User user) {
        this.doors = doors;
        this.user = user;
    }

    public Game() {

    }

    public Boolean[] start(Random random) {

        int doorChoosen = user.chooseDoor(doors.size());

        System.out.println("o sistema possui " + doors.size() + " portas");
        System.out.println("o usuário escolheu a porta de número " + doorChoosen);
        System.out.println("o prêmio está na porta: " +
                doors.indexOf(doors.stream().filter(d -> d.hasPrize).findFirst().get()));

        List<Door> teste = doors.stream()
                .filter(door -> !door.hasPrize && doors.indexOf(door) != doorChoosen).toList();

        teste.get(random.nextInt(teste.size())).setOpen(true);

        System.out.println(teste);

        for (int i = 0; i < doors.size(); i++) {
            System.out.println("a porta de número " + i + " está: " + doors.get(i).isOpen);
        }


        List<Door> closedDoors = doors.stream().filter(d -> !d.isOpen).toList();

        int finalDoor = user.chooseDoor(closedDoors.size());

        boolean switchedDoor = !doors.get(doorChoosen).equals(closedDoors.get(finalDoor));
        System.out.println("Trocou para a porta: " + finalDoor);
        boolean won = closedDoors.get(finalDoor).hasPrize;
        System.out.println(won);

        return new Boolean[]{switchedDoor, won};

    }

}