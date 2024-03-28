import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Door {

    boolean hasPrize;

    boolean isOpen;

    int doorNumber;

    public Door(boolean hasPrize, int doorNumber) {
        this.hasPrize = hasPrize;
        this.isOpen = false;
        this.doorNumber = doorNumber;
    }

    @Override
    public String toString() {
        return "porta " + doorNumber;
    }
}
