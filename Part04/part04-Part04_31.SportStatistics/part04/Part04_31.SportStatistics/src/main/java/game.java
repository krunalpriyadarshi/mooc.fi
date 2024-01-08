public class game {
    private String team1, team2;
    private int score1, score2;

    game(String team1, String team2, int score1, int score2){
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
    }

    public int didWin(String team){
        if(hasTeam(team)){
            if(this.team1.equals(team)){
                return score1 - score2;
            }
            else{
                return score2 - score1;
            }
        }
        else{
            return 0;
        }
    }

    public boolean hasTeam(String team){
        if(this.team1.equals(team) || this.team2.equals(team)){
            return true;
        }
        else{
            return false;
        }
    }
}
