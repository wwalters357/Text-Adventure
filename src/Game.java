import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

class Game {
  private boolean running;
  private ArrayList<Level> levels;
  private Player player;

  public Game(int numLevels) {
    running = true;
    levels = new ArrayList<>(numLevels);
    for(int i = 0; i < numLevels; i++){
      levels.add(new Level((int)(Math.random() * 6 + 5)));
    }
    for(Level currLevel : levels){
      playLevel(currLevel);
    }
  }

  public void playLevel(Level level){
    for(Room room : level.getLayout()){
      if(room.getType() == RoomType.ENEMY){
        System.out.println("You have entered a monster room\nPrepare for battle");
        Enemy e = room.getEnemy();
        battle(player, e);

      }
      else if (room.getType() == RoomType.ITEM){

      }
      else if (room.getType() == RoomType.MERCHANT){

      }
      else {

      }
    }
  }

  public void battle(Player p, Enemy e) {
    boolean battleOngoing = true;
    System.out.println("You have encountered an Enemy: " + e.getName());

    while(battleOngoing) {
      int move = 0;
      Scanner sc = new Scanner(System.in);
      move = sc.nextInt();
      System.out.print("What is your move: ");
    }
  }
}