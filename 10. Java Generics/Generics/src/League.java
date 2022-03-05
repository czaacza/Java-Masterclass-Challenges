import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String name;
    ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T newTeam) {
        if (findTeam(newTeam.getName()) >= 0) {
            System.out.println("Team is already in the league.");
            return false;
        } else {
            teams.add(newTeam);
            System.out.println("Team successfully added.");
            return true;
        }
    }

    private int findTeam(String teamName) {
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getName() == teamName) {
                return i;
            }
        }
        return -1;
    }

    public void showLeagueTable(){
        Collections.sort(teams);
        for(T t: teams){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

}