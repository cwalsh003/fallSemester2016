import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by cwalsh on 9/11/16.
 */
public class IntList {

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        int num = 0;
        int[] arr = new int[50];
        int ctr = 0;
        while(num != -9999) {
            System.out.println("Enter the next number enter -9999 to quit...");
            num = kb.nextInt();
            if(num == -9999){
                break;
            }else {
                arr[ctr] = num;
                ctr++;
            }
        }

        IntList intList = new IntList(arr);

        intList.printList();
    }



    private ArrayList<num> numArray;

    public class num{
        private int number;
        private int count = 0;

        public num(int number, ArrayList<num> list){
                this.number = number;
                this.count++;

        }

        public num doesExist(num numObject, int number, ArrayList<num> list){
            num temp = numObject;
            for (num item : list){
                if (item.number == numObject.number){
                    temp = item;
                    return temp;
                }else{
                    temp = numObject;
                }
            }
            return temp;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getNumber() {
            return number;
        }

        public int getCount() {
            return count;
        }
    }

    public IntList(int[] arr){
        numArray = new ArrayList<>();
        for(int c : arr){
            if(c == 0){

            }else {
                numArray.add(new num(c, numArray));
            }
        }
        this.consolidate();
    }

public void consolidate(){
        ArrayList<num> temp = new ArrayList<>();
    Boolean isFound = true;

    while(isFound){
        for(int i = 0; i < numArray.size(); i++) {
            for (int j = i + 1; j < numArray.size(); j++) {
                if (numArray.get(i).getNumber() == numArray.get(j).getNumber()) {
                    this.numArray.get(i).setCount(numArray.get(i).getCount() + numArray.get(j).getCount());
                    this.numArray.remove(j);
                    this.numArray.trimToSize();
                    isFound = true;
                }else {
                    isFound = false;
                }
            }
        }
    }
    }

    public void printList(){
        Collections.sort(numArray, new MyComparator());
        System.out.format("%-15s %15s\n", "N" , "Count");
        for(num n : numArray){

            System.out.format("%-15s", n.getNumber());
            System.out.format("%15s\n", n.getCount());

        }
    }

    class MyComparator implements Comparator<num> {
        @Override
        public int compare(num o1, num o2) {
            if (o1.getNumber() > o2.getNumber()) {
                return -1;
            } else if (o1.getNumber() < o2.getNumber()) {
                return 1;
            }
            return 0;
        }}

}
