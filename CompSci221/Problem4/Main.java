package Problem4;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by cwalsh on 9/28/16.
 */
public class Main {
    public static void main(String[] args){
        DecimalFormat dcf = new DecimalFormat("##.##");
        DecimalFormat dcf2 = new DecimalFormat("##");
        try {

            HashMap<String, ArrayList<Double>> MovieMap = new HashMap<>();

            MovieMap = FileReaderClass.readFile();

                for(String title : MovieMap.keySet()){
                    Double avgRating = MovieMap.get(title).get(0);
                    Double numberOfRatings = MovieMap.get(title).get(1);
                    System.out.println("The movie " + title + " has a total of " + dcf2.format(numberOfRatings) + " reviews with an average of " + dcf.format(avgRating / numberOfRatings) + " stars out of 5");
                }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
