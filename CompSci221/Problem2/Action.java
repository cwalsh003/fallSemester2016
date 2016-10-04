package Problem2;

/**
 * Created by cwalsh on 9/24/16.
 */
public class Action extends Movie {

    public Action(String MPAARating, String IDNumber, String title) {
        super(MPAARating, IDNumber, title);
    }
    @Override
    public double calculateLateFees(int days) {
        return (days * 3);
    }
}
