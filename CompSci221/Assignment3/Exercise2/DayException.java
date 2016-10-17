package Exercise2;

/**
 * Created by cwalsh on 10/12/16.
 */
public class DayException extends Exception {

    public DayException() {
        super("Illegal input");
    }

    public DayException(String message) {
        super(message);
    }

}
