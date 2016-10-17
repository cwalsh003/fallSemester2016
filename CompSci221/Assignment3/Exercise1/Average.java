package Exercise1;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cwalsh on 10/10/16.
 */
public class Average {


    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        Integer numberOfArgs = 0;
        List<Integer> values = new ArrayList<>();
        Integer sum = 0;
        Integer temp = 0;
        Boolean flag = true;
        Integer i = 0;
        Boolean valid = true;
        do {
            try {

                System.out.println("Enter the number of values you want to enter");
                numberOfArgs = kb.nextInt();
                validate(numberOfArgs);
                System.out.println("Enter the values");
                i = numberOfArgs;
                valid = true;
            }catch(Exception ex){
                System.out.println(ex.getMessage());
                valid = false;
            }
        }while(!valid);
        do {
            System.out.println("Enter value " + Integer.valueOf((numberOfArgs + 1) - i) + " ");
            temp = kb.nextInt();

            try {
                validate(temp);
                sum += temp;
                values.add(temp);
                i--;
            } catch (Exception ex) {
                System.out.print(ex.getMessage());
            }


        }while(i > 0);

        System.out.println("The average is: " +  (double)sum / values.size());

    }

    public static void validate(Integer val) throws Exception{
        if(val < 0){
           throw new Exception("You can't add a negative \n");
        }

    }


}
