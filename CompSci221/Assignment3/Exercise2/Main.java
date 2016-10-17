package Exercise2;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

/**
 * Created by cwalsh on 10/12/16.
 */
public class Main {

    public static void main(String[] args) {

        String date2 = " ";
        Boolean valid = true;
        Scanner kb = new Scanner(System.in);

do {


    try {

        System.out.println("Enter the date: mm/dd/yyyy");
        date2 = kb.nextLine();

        if (Integer.valueOf(parseMonth(date2)) < 1 || Integer.valueOf(parseMonth(date2)) > 12) {
            throw new MonthException("Enter a correct month gangsta.\n");
        } else if (Integer.valueOf(parseDay(date2)) < 1 || Integer.valueOf(parseDay(date2)) > 31) {
            throw new DayException("Enter a correct day gangsta\n");
        } else if (Integer.valueOf(parseYear(date2)) < 1000 || Integer.valueOf(parseYear(date2)) > 3000) {
            throw new YearException("Enter a correct year gangsta\n");
        }

    }catch (StringIndexOutOfBoundsException siobe){
        System.out.println(siobe.getMessage());
        valid = false;
    }
    catch (MonthException monthException) {
        System.out.println(monthException.getMessage());
        valid = false;
    } catch (DayException dayException) {
        System.out.println(dayException.getMessage());
        valid = false;

    } catch (YearException yearException) {
        System.out.println(yearException.getMessage());
        valid = false;

    }catch(Exception ex) {
            System.err.println("You did something else wrong");
            valid = false;
        }

}while(!valid);

        DateFormatter date = new DateFormatter(parseMonth(date2), parseDay(date2), parseYear(date2));

        System.out.println(date.toString());

}
    public static String parseMonth(String date) {
        Integer end = 0;
        for (int i = 0; i < date.length(); i++) {
            if (date.charAt(i) == '/') {
                end = i;
                break;
            }
        }
        String date3 = date.substring(0, end);
        return date.substring(0, end);

    }

    public static String parseDay(String date) {
        Integer end = 0;
        Integer start = 0;
        Boolean flag = false;
        for (int i = 0; i < date.length(); i++) {
            if (date.charAt(i) == '/' && flag == false) {
                start = i;
                flag = true;
            } else if (date.charAt(i) == '/') {
                end = i;
            }
        }
        return date.substring(start + 1, end);
    }

    public static String parseYear(String date) {
        Integer end = 0;
        Integer start = 0;
        Boolean flag = false;
        for (int i = 0; i < date.length(); i++) {
            if (date.charAt(i) == '/' && flag == false) {
                start = i;
                flag = true;
            } else if (date.charAt(i) == '/') {
                end = i;
            }
        }
        return date.substring(end + 1);
    }
}






