public class Team {
    Player[] players;

    public Team() {
        players = new Player[9];
    }

    public Team(int numPlayers) {
        players = new Player[numPlayers];
    }

    public void printTeamStats() {
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i].getName() + "\t#" + players[i].getNumber() + "\t" + "average >>> " + players[i].getBattingAverageString());
        }
    }

    public int numPlayers() {
        return players.length;
    }

    public Player returnIndexPlayer(int index) {
        return players[index];
    }

    public void addPlayer(Player p, int n) {
        Player[] playerNew = new Player[players.length + 1];
        
        int x = 0;
        
        for(int i = 0; i < playerNew.length; i++) {
            if(i == n) {
                playerNew[i] = p;
            }
            else {
                playerNew[i] = players[x];
                x++;
            }
        }
        players = playerNew;
    }
 }
