/**
 * Elevator class to move people to different floors.
 */
public class ElevatorImpl implements Elevator {
  private int currentFloor = 0;
  private final int minFloor;
  private final int maxFloor;

  /**
   * Creates an Elevator that can move people to different floors.
   *
   * @param minFloor the lowest floor.
   * @param maxFloor the highest floor.
   */
  public ElevatorImpl(int minFloor, int maxFloor) {
    this.minFloor = minFloor;
    this.maxFloor = maxFloor;
  }

  @Override
  public void requestFloor(int personFloor, int targetFloor) {
    if(personFloor < minFloor || personFloor > maxFloor) {
      System.out.println("Invalid person floor.");
    }
    else if (targetFloor < minFloor) {
      System.out.println("Floor is too low.");
    }
    else if (targetFloor > maxFloor) {
      System.out.println("Floor is too high.");
    }
    else if (targetFloor == personFloor) {
      System.out.println("Person is already at this floor.");
    }
    else {
      System.out.println("Person is at floor " + personFloor + floorsMovedToPerson(personFloor));
      System.out.println("Elevator is now at floor " + targetFloor);
      currentFloor = targetFloor;
    }
  }

  @Override
  public void floorOfElevator() {
    System.out.println("Elevator is currently at floor " + currentFloor);
  }

  /**
   * Helper function to see where the elevator is in relation to the person.
   *
   * @param personFloor floor person wants to go to.
   *
   * @return the direction and floors the elevator moves in.
   */
  private String floorsMovedToPerson(int personFloor) {
    int floors = currentFloor - personFloor;

    if (floors == 0) {
      return "";
    } else if (personFloor < currentFloor) {
      return " Elevator moved down " + Math.abs(floors) + " floors to person.";
    } else {
      return " Elevator moved up " + Math.abs(floors) + " floors to person.";
    }
  }
}
