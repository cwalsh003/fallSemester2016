package Exercise3;

import java.util.Scanner;

/**
 * Created by cwalsh on 10/12/16.
 */
public class Bowling {

    public static void main(String[] args) {
        Integer rows = 0;
        Scanner kb = new Scanner(System.in);

        do {
            System.out.println("How many rows of pins are there ");
            rows = kb.nextInt();
            if(rows >=5) {
                count(rows);
            }
        }while(rows < 5);

        System.out.println(count(9));
    }


    public static Integer count(Integer rows) {
        if(rows == 1){
            return 1;
        }
        return count(rows - 1) + rows;
    }
}