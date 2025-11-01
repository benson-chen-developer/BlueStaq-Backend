/**
 * Elevator class to move people to different floors.
 */
public interface Elevator {
  /**
   * Person at currentFloor calls elevator to go to targetFloor
   */
  void requestFloor(int personFloor, int targetFloor);

  /**
   * Prints the floor the elevator is at.
   */
  void floorOfElevator();
}
