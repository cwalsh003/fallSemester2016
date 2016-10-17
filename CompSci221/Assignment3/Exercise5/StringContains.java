package Exercise5;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cwalsh on 10/16/16.
 */
public class StringContains {

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String string = "";
        String needle = "";
        System.out.println("Enter a string to check. ");
        string = kb.nextLine();
        System.out.println("Enter a substring. ");
        needle = kb.nextLine();


    if(contains(string, needle) == true){
        System.out.println("The string is in the string");
    }else{
        System.out.println("The string is not in the string");
    }

    }

    public static List<Character> stringToArray(String string){
        List<Character> retArr = new ArrayList<>();
        if(string != "") {
            for (int i = 0; i < string.length(); i++) {
                retArr.add(string.charAt(i));
            }
        }else{
            retArr.add(' ');
        }
        return retArr;
    }
public static Boolean contains(String haystack, String needle){
    return containsArray(stringToArray(haystack), stringToArray(needle));
}

    public static Boolean containsArray(List<Character> haystack, List<Character> needle){

        int i = 1;
            if(needle.get(0) == ' ' || haystack.get(0) == ' '){return false;}
            if(needle.size() > haystack.size() ){return false;}
            if(haystack.get(0) == needle.get(0)){
                while(haystack.get(i) == needle.get(i)){
                    i++;
                    if(needle.size() <= i){
                        return true;
                    }
                }
            }

                haystack.remove(0);
                return containsArray(haystack,  needle);

    }


}
