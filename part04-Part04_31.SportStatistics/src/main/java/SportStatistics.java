
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Team {

    private String name;
    private int nrGames;
    private int nrWins;
    private int nrLosses;

    public Team(String name, int nrGames, int nrWins, int nrLosses) {
        this.name = name;
        this.nrGames = nrGames;
        this.nrWins = nrWins;
        this.nrLosses = nrLosses;
    }

    public int getNrGames() {
        return nrGames;
    }

    public int getNrWins() {
        return nrWins;
    }

    public int getNrLosses() {
        return nrLosses;
    }

    public void incWins() {
        ++this.nrWins;
    }

    public void incLosses() {
        ++this.nrLosses;
    }

    public void incGames() {
        ++this.nrGames;
    }

}

public class SportStatistics {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        Map<String, Team> teamsMap = new HashMap<>();
        List<Team> myTeamList = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
//            System.out.println("Into try block");
            while (fileScanner.hasNextLine()) {
                String arrStr[] = fileScanner.nextLine().split(",");
                String teamName1 = arrStr[0];
                String teamName2 = arrStr[1];
                int pointsTeam1 = Integer.valueOf(arrStr[2]);
                int pointsTeam2 = Integer.valueOf(arrStr[3]);

                Team myTeamReference = null;
                if (teamsMap.containsKey(teamName1) == false) {
                    myTeamReference = new Team(teamName1, 0, 0, 0);
                    teamsMap.put(teamName1, myTeamReference);
                } else {
                    myTeamReference = teamsMap.get(teamName1);

                }
                myTeamReference.incGames();
                if (pointsTeam1 > pointsTeam2) {
                    myTeamReference.incWins();
                } else {
                    myTeamReference.incLosses();
                }

                if (teamsMap.containsKey(teamName2) == false) {
                    myTeamReference = new Team(teamName2, 0, 0, 0);
                    teamsMap.put(teamName2, myTeamReference);
                } else {
                    myTeamReference = teamsMap.get(teamName2);

                }
                myTeamReference.incGames();
                if (pointsTeam2 > pointsTeam1) {
                    myTeamReference.incWins();
                } else {
                    myTeamReference.incLosses();
                }

            }
        } catch (Exception e) {
            System.out.println("Exception caught " + e.getMessage());
        }

        System.out.println("Team:");
        String team = scan.nextLine();
        Team myTeam = teamsMap.get(team);
        if (myTeam != null) {
//            System.out.println(teamsMap.isEmpty());
            System.out.println("Games: " + myTeam.getNrGames());
            System.out.println("Wins: " + myTeam.getNrWins());
            System.out.println("Losses: " + myTeam.getNrLosses());
        } else {
            System.out.println("Games: " + 0);
            System.out.println("Wins: " + 0);
            System.out.println("Losses: " + 0);            
        }
        scan.close();

    }

}
