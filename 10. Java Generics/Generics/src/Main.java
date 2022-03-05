public class Main {
    public static void main(String[] args) {

       League<Team<FootballPlayer>> premierLeague = new League<>("Premier League");
        Team<FootballPlayer> chelseaLondon = new Team<>("Chelsea London");
        Team<FootballPlayer> liverpool = new Team<>("Liverpool");
        Team<FootballPlayer> manchester = new Team<>("Manchester City");
        Team<FootballPlayer> arsenalLondon = new Team<>("Arsenal London");

        premierLeague.addTeam(chelseaLondon);
        premierLeague.addTeam(liverpool);
        premierLeague.addTeam(manchester);
        premierLeague.addTeam(arsenalLondon);

        chelseaLondon.matchResult(liverpool, 2, 1);
        liverpool.matchResult(manchester, 5,1);
        manchester.matchResult(chelseaLondon, 1, 3);
        arsenalLondon.matchResult(chelseaLondon, 0, 0);

        premierLeague.showLeagueTable();


    }
}
