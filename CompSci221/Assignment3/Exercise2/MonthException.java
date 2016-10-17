package Exercise2;

/**
 * Created by cwalsh on 10/12/16.
 */
public class MonthException extends Exception {
    public MonthException() {
        super("Illegal input");
    }

    public MonthException(String message) {
        super(message);
    }
}
