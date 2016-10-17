package Exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by cwalsh on 10/13/16.
 */
public class RecursiveArray {

    public static void main(String[] args) {
        String[][] data = {
                {"A", "B"},
                {"1", "2"},
                {"XX", "YY", "ZZ"}
        };
        List<List<String>> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list = twoDArrayToList(data);
        list2 = cartProduct(list);
        for (String s: list2){
            System.out.print(s + "\n");
        }

    }

    // Below code is from http://stackoverflow.com/questions/11447780/convert-two-dimensional-array-to-list-in-java
    public static List<List<String>> twoDArrayToList(String[][] twoDArray) {
        List<List<String>> list = Arrays.stream(twoDArray)
                .map(Arrays::asList)
                .collect(Collectors.toList());
        return list;
    }
    //Above code is from from http://stackoverflow.com/questions/11447780/convert-two-dimensional-array-to-list-in-java


    public static List<String> cartProduct(List<List<String>> data) {
        if (data.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> subList = data.remove(0);
        List<String> myStrings = new ArrayList<>();
        for (String s : subList) {
            myStrings.add(s.toString());
        }

        return cartProducthelper(data, myStrings);

    }
    public static List<String> cartProducthelper(List<List<String>> data, List<String> retVal){
        if(data.size() == 0) { return retVal; }
        List<String> FList = data.remove(0);
        List<String> ret = new ArrayList<>();

        for(String s : retVal) {
            for(String c : FList) {
                ret.add(s + " " + c + " ");
            }
        }
        return cartProducthelper(data, ret);
    }

}