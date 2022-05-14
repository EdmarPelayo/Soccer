import java.util.ArrayList;
import java.util.Random;
public class Games {

    private int gameNumber;
    private ArrayList<Games> games = new ArrayList<Games>();
    Random rand = new Random();

    public Games(int gameNumber){
      this.gameNumber = gameNumber;

    }


    public int getGameNumber() {
        return gameNumber;
    }

    public void setGameNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }

    public ArrayList<Games> getGames() {
        return games;
    }

    public void setGames(ArrayList<Games> games) {
        this.games = games;
    }
    public void gamePlay(Team teamHolder, Team teamHolder2, int temperature ){
        int possibleScore;
        if(temperature >=80)
        {
            possibleScore = 8;
        }
        else
        {
            possibleScore = 4;
        }

        int team1Score = rand.nextInt(0, possibleScore);
        int team2Score = rand.nextInt(0 ,possibleScore);

        teamHolder.setTotalGoalsScored(teamHolder.getTotalGoalsAllowed() + team1Score);
        teamHolder2.setTotalGoalsScored(teamHolder.getTotalGoalsAllowed() + team2Score);

        System.out.println("");
        System.out.println("Game #"+getGameNumber());
        if (team1Score > team2Score)
        {
            System.out.println(teamHolder.getName()+ " won!");
            teamHolder.setWinTotal(teamHolder.getWinTotal()+1);
            teamHolder2.setLossTotal(teamHolder2.getLossTotal()+1);
        }
        else if(team1Score == team2Score){
            System.out.println("Tie Game!");
            teamHolder.setTieTotal(teamHolder.getTieTotal()+1);
            teamHolder2.setTieTotal(teamHolder2.getTieTotal()+1);
        }
        else
        {
            System.out.println(teamHolder2.getName()+ " won!");
            teamHolder2.setWinTotal(teamHolder2.getWinTotal()+1);
            teamHolder.setLossTotal(teamHolder.getLossTotal()+1);

        }
        System.out.println(teamHolder.getName() +" has scored "+ team1Score + " points!");
        System.out.println(teamHolder2.getName() +" has scored "+ team2Score+ " points!");

        setGameNumber(getGameNumber()+1);
    }
}
