
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        ArrayList<game> games = getGames(file);

        int win = 0, lose = 0;

        for(game g: games){
            if(g.didWin(team) > 0){
                win += 1;
            }
            else if(g.didWin(team) < 0){
                lose += 1;
            }
        }

        System.out.println("Games: " + (win + lose));
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);


    }

    public static ArrayList<game> getGames(String file) {
        ArrayList<game> games = new ArrayList<>();
        try {
            Scanner sc = new Scanner(Paths.get(file));

            while (sc.hasNextLine()){
                String[] arr = sc.nextLine().split(",");
                games.add(new game(arr[0], arr[1], Integer.valueOf(arr[2]), Integer.valueOf(arr[3])));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return games;

    }

}
