import java.util.Scanner;


public class Schedular {
    Scanner scanner = new Scanner(System.in);
    private Team team1;
    private Team team2;
    private int temp;
    public Schedular(Team team1, Team team2){
        this.setTeam1(team1);
        this.setTeam2(team2);

    }
    public void askTemp(){
        System.out.println("Please enter a temperture: ");
        setTemp(scanner.nextInt());

    }



    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
