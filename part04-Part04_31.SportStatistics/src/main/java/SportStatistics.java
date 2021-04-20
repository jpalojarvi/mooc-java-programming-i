
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        ArrayList<Game> games = readRecordsFromFile(file);
        // System.out.println(games.toString());
        
        System.out.println("Team:");
        String searchedTeam = scan.nextLine();
        int gamesCount = 0;
        int winsCount = 0;
        int lossesCount = 0;
        
        for (Game iteratedGame : games){
            if (searchedTeam.equals(iteratedGame.getHomeTeamName()) || searchedTeam.equals(iteratedGame.getVisitingTeamName())){
                gamesCount++;
            }
        }
        
        for (Game iteratedGame : games) {
            if (searchedTeam.equals(iteratedGame.getHomeTeamName()) && (iteratedGame.getHomeTeamPoints() > iteratedGame.getVisitingTeamPoints())){
                winsCount++;
            } else if (searchedTeam.equals(iteratedGame.getVisitingTeamName()) && (iteratedGame.getVisitingTeamPoints() > iteratedGame.getHomeTeamPoints())){
                winsCount++;
            } else if (searchedTeam.equals(iteratedGame.getVisitingTeamName()) || (searchedTeam.equals(iteratedGame.getHomeTeamName()))){
                lossesCount++;
            }
                
        }
        
        System.out.println("Games: " + gamesCount);
        System.out.println("Wins: " + winsCount);
        System.out.println("Losses: " + lossesCount);

    }

    // Write here the code for reading from file
    // and printing the read records
    public static ArrayList<Game> readRecordsFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();
        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                games.add(new Game(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }

            for (Game iteratedGame : games) {
                // System.out.println(iteratedGame.toString());
                
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return games;

    }

}
