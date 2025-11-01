//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Elevator elevator = new ElevatorImpl(1, 10);

    elevator.requestFloor(0, 10);
    elevator.requestFloor(5, 10);
    elevator.requestFloor(1, 2);
    elevator.floorOfElevator();

    elevator.requestFloor(1, 11);
    elevator.requestFloor(1, 0);
    elevator.requestFloor(0, 0);
  }
}