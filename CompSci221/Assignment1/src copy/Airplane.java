import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

/**
 * Created by cwalsh on 8/29/16.
 */
public class Airplane {

    public static void main(String[] args) {
        int sent = 1;
        String col;
        Scanner kb = new Scanner(System.in);
        Airplane a1 = new Airplane();
        while (true) {
            System.out.println("Enter a row number enter -99 to exit");
            sent = kb.nextInt();
            if (sent == -99) break;
            kb.nextLine();
            System.out.println("Enter a column letter");
            col = kb.nextLine();
            a1.setSeats(sent++, col);
            a1.printBoard();
            }
        }

    private int[][] seats = new int[8][4];

    public  Boolean isFull(){

        Boolean flag = true;

        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                char[] a = Character.toChars(j + 65);
                String b = new String(a);
             if(isOpen(i, b)){
                 flag = false;
                 break;
             }
            }
        }
        return flag;
    }
    
    public void setSeats(int row, String col) {
        //checkSeats(0)
        if(isOpen(row, col) && !isFull()) {
            switch (col.toLowerCase()) {
                case "a":
                    this.seats[row][0] = 'X';
                    break;
                case "b":
                    this.seats[row][1] = 'X';
                    break;
                case "c":
                    this.seats[row][2] = 'X';
                    break;
                case "d":
                    this.seats[row][3] = 'X';
                    break;
                default:
                    System.out.println("Invalid entry try again");
            }
        }else{
            System.out.println("\n\nThe seat is taken try again\n\n");
        }

    }



    public Airplane() {

        this.seats = new int[8][4];
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                this.seats[i][j] = ' ';
            }
        }
    }

    public Boolean isOpen(int row, String column){

        int columnI = 0;
        switch (column.toLowerCase()) {
            case "a":
                columnI = 0;
                break;
            case "b":
                columnI = 1;
                break;
            case "c":
                columnI = 2;
                break;
            case "d":
                columnI = 3;
                break;
            default:

        }
        if( this.seats[row][columnI] == 32){
            return true;
        }else{
            return false;
        }
    }

    public void printBoard() {
        for (int i = 1; i < 8; i++) {
            System.out.print(i);
            System.out.print(".   |");
            for (int j = 0; j < 4; j++) {
                System.out.print(Character.toChars(j + 65));
                System.out.print("   ");
                System.out.print(Character.toChars(seats[i][j]));
                System.out.print("  | ");
            }
            System.out.println();
            System.out.println();
        }
    }


}