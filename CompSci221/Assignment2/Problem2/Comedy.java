package Problem2;

/**
 * Created by cwalsh on 9/24/16.
 */
public class Comedy extends Movie {
    public Comedy(String MPAARating, String IDNumber, String title) {
        super(MPAARating, IDNumber, title);
    }

    @Override
    public double calculateLateFees(int days) {
        return (days * 2.50);
    }
}
