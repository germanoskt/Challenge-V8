import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Door {
  boolean hasPrize;
  boolean isOpen;

  public Door() {
    this.hasPrize = false;
    this.isOpen = false;
  }

}
