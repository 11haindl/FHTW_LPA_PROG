package at.fhtw.football;

public class Corner extends MatchEvent {

    public Corner(Team team, MatchTime matchTime, String player) throws MatchTimeException{
        super(team, matchTime, player);
    }

    public Corner(Corner corner) throws MatchTimeException
    {
        super(corner.getTeam(), corner.getMatchTime(), corner.getPlayer());
    }

    @Override
    public String description() {
        return "Corner";
    }
}
