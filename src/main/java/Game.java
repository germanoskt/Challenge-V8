import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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


    public List<Boolean> start () {
        List<Door> doors = new ArrayList<>();

        doors.add(door1);
        doors.add(door2);
        doors.add(door3);

        int doorChoosen = user.chooseDoor(doors.size());

        System.out.println("Porta escolhida pelo usuario: " + doors.get(doorChoosen));

        // Apresentador abre uma porta
        for (int i = 0; i < doors.size(); i++) {
            Door currentDoor = doors.get(i);

            if (currentDoor.hasPrize) {
                continue;
            }
            if (doorChoosen == i) {
                continue;
            }
            currentDoor.setOpen(true);
            System.out.format("Porta aberta: %d \n", (i + 1));
            break;
        }

        // Usuario escolhe trocar a porta
       List<Door> closedDoors = doors.stream().filter(d -> !d.isOpen).toList();

        int finalDoor = user.chooseDoor(closedDoors.size());

        for (Door door : closedDoors) {
            door.setOpen(true);
        }

        boolean switchedDoor = false;
        //trocamos a referência de comparação
        //de posição para objetos
        if (!doors.get(doorChoosen).equals(closedDoors.get(finalDoor))){
            switchedDoor = true;
            System.out.println("Trocou para a " + closedDoors.get(finalDoor));
        } else {
            System.out.println("Não trocou de porta");
        }

        Boolean won = false;
        if (closedDoors.get(finalDoor).hasPrize) {
            won = true;
            System.out.println("Você ganhou!!! EBBAAAAA\n");
        }else{
            System.out.println("Você perdeu!!!\n");
        }

        List<Boolean> result = Arrays.asList(switchedDoor, won);

        return result;
    }
}
