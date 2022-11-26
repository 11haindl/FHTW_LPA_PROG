
package at.fhtw.football;

public class MatchTime implements Comparable<MatchTime> {

    private int basetime;
    private int overtime;


    public MatchTime(int time) throws MatchTimeException{
        if (time > 0)
            this.basetime = time;
        else
            throw new MatchTimeException("time must be greater than 0");

        this.overtime = 0;
    }

    public MatchTime(int time, int ot)  throws MatchTimeException{
        this(time);
        if (ot > 0)
            this.overtime = ot;
    }
    public MatchTime(MatchTime matchTime)  throws MatchTimeException{
        this(matchTime.basetime, matchTime.overtime);
    }

    public Time segment() {
        if (this.basetime <= 45) {
            return Time.HALF_ONE;
        }
        if (this.basetime <= 90) {
            return Time.HALF_TWO;
        }
        if (this.basetime <= 105) {
            return Time.EXTRATIME_ONE;
        }
        if (this.basetime <= 120) {
            return Time.EXTRATIME_TWO;
        } else {
            return Time.PENALTY_SHOOTOUT;
        }
    }

    @Override
    public String toString() {
        String resultString = null;
        if (this.overtime == 0) {
            resultString = String.format("[%d]", this.basetime);
        }
        if (this.overtime != 0) {
            resultString = String.format("[%d+%d]", this.basetime, this.overtime);
        }
        if (this.basetime > 120) {
            resultString = String.format("[PEN]");
        }

        return resultString;
    }

    @Override
    public int compareTo(MatchTime other) {
        if (Integer.compare(this.basetime, other.basetime) == 0) {
            return Integer.compare(this.overtime, other.overtime);
        }
            return Integer.compare(this.basetime, other.basetime);
    }

    public void setBasetime(int basetime) {
        this.basetime = basetime;
    }
}
