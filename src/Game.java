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

  private void playLevel(Level level){
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

      while(true)
        System.out.print("What is your move? 1: Attack, 2: Defend, 3: Item, 4: Run: ");

        switch(move) {
          case 1:
            player.attack();
            break;
          case 2:
            player.defend(e.getDamage());
            break;
          case 3:
            player.item(0);
            break;
          case 4:
            player.run();
            break;
          default:
            System.out.println("Invalid Response.  Try Again");
            break;
        }
      if(enemy.tempHealth <= 0) {
        System.out.println("You have defeated the :" + e.getName());
        break;
      }
      else if(player.tempHealth <= 0) {
        System.out.println("You have defeated the :" + e.getName());
        break;
      }
    }
  }
}