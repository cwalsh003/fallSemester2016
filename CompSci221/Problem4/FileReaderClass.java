package Problem4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by cwalsh on 9/28/16.
 */
public class FileReaderClass {



    public static HashMap<String, ArrayList<Double>> readFile() throws IOException {
        HashMap<String, ArrayList<Double>> MovieMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("movieFile.txt"));) {
            // (2) process
            String line = "2";
            Integer amount = Integer.parseInt(br.readLine());
            String rating = line;
            String title = "";

            while (line != null && amount != 0) {
                line = br.readLine();
                title = line;



                line = br.readLine();
                rating = line;


                if (line != null) {

                    if(MovieMap.containsKey(title)){
                        ArrayList<Double> temp = new ArrayList<>();
                        temp.add(0.0);
                        temp.add(0.0);
                        Double currentReview = Double.parseDouble(rating);
                        Double numberOfReviews = MovieMap.get(title).get(1);
                        Double oldReview = MovieMap.get(title).get(0);
                        MovieMap.get(title).set(1, numberOfReviews++);
                        temp.set(0, currentReview + oldReview);
                        temp.set(1, numberOfReviews++);
                        MovieMap.put(title, temp);
                    }else{
                        ArrayList<Double> temp = new ArrayList<>();
                        Double currentReview = Double.parseDouble(rating);
                        temp.add(currentReview);
                        temp.add(1.0);
                        MovieMap.put(title, temp);


                    }
                }
                amount--;
            }


        } catch (FileNotFoundException e) {
            System.err.println("File not found " +  e.getMessage());
        }

        return MovieMap;
    }

}
