import java.util.Scanner;

class Game {
  private boolean running;

  public Game() {
    
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
            player.defend();
            break;
          case 3:
            player.item();
            break;
          case 4:
            player.run();
            break;
          default:
            System.out.println("Invalid Response.  Try Again");
            break;

      if(enemy.tempHealth == 0){
        System.out.println("You have defeated the :" + e.getName());
        break;
      }
      }
    }
  }
}