import java.util.Arrays;
import java.util.List;
import lombok.ToString;

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

  public Boolean[] start() {

    List<Door> doors = Arrays.asList(door1, door2, door3);
    int doorChoosen = user.chooseDoor(doors.size());

    doors.stream()
             .filter(door -> !door.hasPrize && doors.indexOf(door) != doorChoosen)
             .findFirst()
             .ifPresent(door -> door.setOpen(true));

    List<Door> closedDoors = doors.stream().filter(d -> !d.isOpen).toList();

    int finalDoor = user.chooseDoor(closedDoors.size());

    closedDoors.forEach(d -> d.setOpen(true));

    boolean switchedDoor = !doors.get(doorChoosen).equals(closedDoors.get(finalDoor));
    boolean won = closedDoors.get(finalDoor).hasPrize;

    return new Boolean[] {switchedDoor, won};
  }
}