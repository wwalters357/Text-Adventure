import java.util.ArrayList;
import java.util.Math;

class Level {
  private int numRooms;
  private ArrayList<Room> layout;

  public Level(int rooms){
    this.numRooms = rooms;
    for(int i = 0; i < numRooms - 1; i++) {
      int type = (int) (Math.random() * 3);
      layout.add(new Room(type));
    }
  }
}