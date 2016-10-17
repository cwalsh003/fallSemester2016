package Exercise2;

/**
 * Created by cwalsh on 10/12/16.
 */
public class YearException extends Exception {
    public YearException() {
        super("Illegal input");
    }

    public YearException(String message) {
        super(message);
    }
}
