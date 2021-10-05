import java.util.*;
import java.io.*;

public class runner {
    public static void main(String[]args) throws FileNotFoundException {
        File file = new File("players.txt");
        Scanner console = new Scanner(file);
        int p = console.nextInt();

        Team liberty = new Team(p);
        console.nextLine();

        for (int i = 0; i < p; i++) {
            liberty.players[i] = new Player(console.next(), console.nextInt(), console.nextInt(), console.nextInt());
            console.nextLine();
        }

        liberty.printTeamStats();
        console.close();
    }
}
