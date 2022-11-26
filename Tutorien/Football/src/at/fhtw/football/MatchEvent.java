package at.fhtw.football;

public abstract class MatchEvent implements Comparable<MatchEvent> {

    private MatchTime matchTime;
    private final String player;
    protected final Team team;

    public MatchEvent(Team team, MatchTime matchTime, String player) throws MatchTimeException {
        this.team = team;
        setMatchTime(matchTime);
        this.player = player;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %s by %s",
                this.matchTime,
                this.team,
                this.description(),
                this.player);
    }

    public abstract String description();

    @Override
    public int compareTo(MatchEvent other) {
        return this.matchTime.compareTo(other.matchTime);
    }

    public Team getTeam() {
        return this.team;
    }

    public MatchTime getMatchTime() {
        try {
            return new MatchTime(matchTime);
        } catch(MatchTimeException e)
        {
            // kann nie der fall sein
            return null;
        }
    }

    public void setMatchTime(MatchTime matchTime) throws MatchTimeException
    {
        this.matchTime = new MatchTime(matchTime);
    }
    public String getPlayer() {
        return player;
    }
}
