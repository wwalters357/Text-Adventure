import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Player p1 = new Player(name, 2, 5, 6);
        Level level1 = new Level(10);
    }
}
