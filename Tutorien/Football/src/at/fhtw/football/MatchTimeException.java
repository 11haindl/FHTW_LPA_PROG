package at.fhtw.football;

public class MatchTimeException extends Exception{


    public MatchTimeException() {
        super();
    }

    public MatchTimeException(String message) {
        super(message);
    }

    public MatchTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MatchTimeException(Throwable cause) {
        super(cause);
    }
}
