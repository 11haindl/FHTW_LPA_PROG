package at.fhtw.football;

public class Goal extends MatchEvent {

    private Type type = Type.REGULAR;
    private String assist;

    public Goal(Team team, MatchTime mt, String player) throws MatchTimeException {
        super(team, mt, player);
        this.assist = null;
    }

    public Goal(Team team, MatchTime matchTime, String player, String assist) throws MatchTimeException{
        this(team, matchTime, player);
        this.assist = assist;
    }

    public Goal(Goal goal)  throws MatchTimeException{
        this(goal.getTeam(), goal.getMatchTime(), goal.getPlayer(), goal.assist);
    }


    public Goal ownGoal() {
        this.type = Type.OWN_GOAL;
        return this;
    }

    public Goal penalty() {
        this.type = Type.PENALTY;
        return this;
    }

    public String typeString() {
        return this.type.toString();
    }

    @Override
    public String description() {
        return "Goal";
    }

    @Override
    public String toString() {
        String resultString = super.toString();
        if (this.assist != null)
            resultString = resultString +
                    String.format(" (assist %s)", this.assist);

        switch (type) {
            case PENALTY:
                resultString = resultString + " P";
                break;
            case OWN_GOAL:
                resultString = resultString + " OG";
                break;
        }
        return resultString;
    }
}
