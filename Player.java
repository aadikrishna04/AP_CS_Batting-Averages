public class Player {
    private String name;
    private int number;
    private int atBats;
    private int hits;
    private double battingAverage;

    public Player(String name, int num) {
        this.name = name;
        this.number = num;
        atBats = 0;
        hits = 0;
    }

    public Player(String name, int num, int atBats, int hits) {
        this.name = name;
        this.number = num;
        this.atBats = atBats;
        this.hits = hits;
    } 

    public double getBattingAverage() {
        this.battingAverage = (double) (hits / atBats);
        return this.battingAverage;
    }

    public String getBattingAverageString() {
        double battingAverage = this.getBattingAverage();
        String battingAverageString = "" + battingAverage;
        battingAverageString = battingAverageString.substring(battingAverageString.indexOf('.'), battingAverageString.length());
        return battingAverageString;
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }
}
