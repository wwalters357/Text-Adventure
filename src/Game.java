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
      System.out.print("What is your move: ");
    }
  }
}