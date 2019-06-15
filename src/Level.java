import java.util.ArrayList;
import java.lang.Math;

class Level {
  private int numRooms;
  private ArrayList<Room> layout;

  public Level(int rooms){
    this.numRooms = rooms;
    layout = new ArrayList<>();
    for(int i = 0; i < numRooms - 1; i++) {
      int type = (int) (Math.random() * 3);
      layout.add(new Room(RoomType.ENEMY));
    }
    layout.add(new Room(RoomType.BOSS));
  }

  public ArrayList<Room> getLayout(){
    return layout;
  }
}