package Exercise2;

import java.util.Scanner;

/**
 * Created by cwalsh on 10/12/16.
 */
public class DateFormatter {

    private String month;
    private String day;
    private String year;

    public DateFormatter(String month, String day, String year) {
        Integer monthI = Integer.valueOf(month);
        switch (monthI){
            case 1: this.month = "January";
            case 2: this.month = "February";
            case 3: this.month = "March";
            case 4: this.month = "April";
            case 5: this.month = "May";
            case 6: this.month = "June";
            case 7: this.month = "July";
            case 8: this.month = "August";
            case 9: this.month = "September";
            case 10: this.month = "October";
            case 11: this.month = "November";
            case 12: this.month = "December";
        }
        this.day = day;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return month + " " + day + ", " + year;
    }
}
