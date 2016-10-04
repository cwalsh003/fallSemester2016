package Problem2;

/**
 * Created by cwalsh on 9/24/16.
 */
public class Movie {
    private String MPAARating;
    private String iDNumber;
    private String title;

    public Movie(String MPAARating, String IDNumber, String title) {
        this.MPAARating = MPAARating;
        this.iDNumber = IDNumber;
        this.title = title;
    }

    public String getMPAARating() {
        return MPAARating;
    }

    public void setMPAARating(String MPAARating) {
        this.MPAARating = MPAARating;
    }

    public String getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(String iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;

        Movie movie = (Movie) o;

        return getiDNumber() != null ? getiDNumber().equals(movie.getiDNumber()) : movie.getiDNumber() == null;

    }

    public double calculateLateFees(int days){
        return days * 2;
    }

}

