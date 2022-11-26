package at.fhtw.football;

import java.util.Locale;

public enum Time {
    PENALTY_SHOOTOUT,
    EXTRATIME_TWO,
    EXTRATIME_ONE,
    HALF_TWO,
    HALF_ONE;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
