import at.fhtw.football.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static void printTeamEvents(List<MatchEvent> history, Team team)
    {
        System.out.printf("\n%s:\n", team.name());
        for (MatchEvent matchEvent : history)
            if (matchEvent.getTeam() == team) {
                System.out.println(matchEvent);
                System.out.println(matchEvent.getMatchTime().segment());
            }
    }

    public static void main(String[] args) {
        List<MatchEvent> history = new LinkedList<>();
        try {
            history.add(new Corner(Team.GUEST, new MatchTime(110), "Kainz"));
            history.add(new Goal(Team.GUEST, new MatchTime(75), "Arnautovic", "Alaba"));
            history.add(new Goal(Team.GUEST, new MatchTime(45, 4), "Ronaldo").ownGoal());
            history.add(new Goal(Team.GUEST, new MatchTime(45, 2), "Holzhauser").ownGoal());
            history.add(new Goal(Team.HOME, new MatchTime(150), "Schöpf").penalty());
            history.add(new Goal(Team.HOME, new MatchTime(45, 1), "Arnautovic").penalty());
            history.add(new Goal(Team.GUEST, new MatchTime(90, 5), "Arnautovic", "Alaba"));
            history.add(new Goal(Team.HOME, new MatchTime(22), "Alaba", "Arnautovic"));
            history.add(new Goal(Team.HOME, new MatchTime(46), "Alaba", "Arnautovic"));
            history.add(new Goal(Team.HOME, new MatchTime(20), "<Illegal Team>", "NN"));
            Goal falseGoal = new Goal(Team.HOME, new MatchTime(99), "<False Team>", "NN");
            history.add(falseGoal);
            Goal copiedGoal = new Goal(falseGoal);
            history.add(copiedGoal);
            falseGoal.getMatchTime().setBasetime(-99);
            copiedGoal.getMatchTime().setBasetime(-299);
            history.add(new Goal(Team.GUEST, new MatchTime(-9), "<Illegal MatchTime>", "NN"));
        }
        catch ( MatchTimeException e)
        {
            e.printStackTrace();
            //throw new IllegalArgumentException("MatchTime konnte nicht instanziert werden", e);
        }
        finally
        {
            System.out.println("Elemente: " + history.size());
        }

        // Comparable sorts
        Collections.sort(history);
        //history.sort(null);

        // Safecopy einer Liste
        //Collections.unmodifiableList(history).clear();
        System.out.println("All Sorted:");
        for (MatchEvent matchEvent : history)
            System.out.println(matchEvent);

        printTeamEvents(history, Team.GUEST);
        printTeamEvents(history, Team.HOME);

        // Comparator sorts
        //history.sort(new MatchEventComparator());
        Collections.sort(history, new MatchEventComparator());

        System.out.println("All Sorted (Comparator):");
        for (MatchEvent matchEvent : history)
            System.out.println(matchEvent);

    }
}
