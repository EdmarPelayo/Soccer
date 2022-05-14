import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Team> teams = new ArrayList<>();
        teams.add(new Team("Lions",0,0,0,0,0));
        teams.add(new Team("Cheetahs", 0,0,0,0,0));
        teams.add(new Team("Leopards",0,0,0,0,0));


        Games game = new Games(1);
        game.gamePlay(teams.get(0),teams.get(1),92);
        game.gamePlay(teams.get(2),teams.get(1), 79);

        teams.get(0).gameResults();
        teams.get(1).gameResults();
        teams.get(2).gameResults();

    }
}
