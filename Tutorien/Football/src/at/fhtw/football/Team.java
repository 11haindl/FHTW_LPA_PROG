package at.fhtw.football;

public enum Team {
    HOME, //0
    GUEST; //1

    @Override
    public String toString() {
        if (this == GUEST)
            return "Guest";
        else {
            return "Home";
        }
    }
}