package at.fhtw.football;

import java.util.Comparator;

public class MatchEventComparator implements Comparator<MatchEvent> {
    @Override
    public int compare(MatchEvent o1, MatchEvent o2) {
        int teamcomp = o1.getTeam().toString().compareTo(o2.getTeam().toString());
        if (teamcomp == 0)
        {
            return o1.getPlayer().compareTo(o2.getPlayer());
        }
        return teamcomp;
    }
}
