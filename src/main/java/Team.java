import java.util.ArrayList;
public class Team {
    private String name;
    private int winTotal;
    private int lossTotal;
    private int tieTotal;
    private int totalGoalsScored;
    private int totalGoalsAllowed;

    public Team(String name, int winTotal, int lossTotal,int tieTotal, int totalGoalsScored,int totalGoalsAllowed){
        this.name = name;
        this.winTotal = winTotal;
        this.lossTotal = lossTotal;
        this.tieTotal = tieTotal;
        this.totalGoalsScored = totalGoalsScored;
        this.totalGoalsAllowed = totalGoalsAllowed;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWinTotal() {
        return winTotal;
    }

    public void setWinTotal(int winTotal) {
        this.winTotal = winTotal;
    }

    public int getLossTotal() {
        return lossTotal;
    }

    public void setLossTotal(int lossTotal) {
        this.lossTotal = lossTotal;
    }

    public int getTieTotal() {
        return tieTotal;
    }

    public void setTieTotal(int tieTotal) {
        this.tieTotal = tieTotal;
    }

    public int getTotalGoalsScored() {
        return totalGoalsScored;
    }

    public void setTotalGoalsScored(int totalGoalsScored) {
        this.totalGoalsScored = totalGoalsScored;
    }

    public int getTotalGoalsAllowed() {
        return totalGoalsAllowed;
    }

    public void setTotalGoalsAllowed(int totalGoalsAllowed) {
        this.totalGoalsAllowed = totalGoalsAllowed;
    }

    public void gameResults(){
        System.out.println("");
        System.out.println("Team: "+getName());
        System.out.println("Wins: "+getWinTotal()+", Losses: "+getLossTotal()+", Ties: "+getTieTotal());

    }
}
