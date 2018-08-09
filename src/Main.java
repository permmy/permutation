import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Main {

    private static void combine(int[] arr, int[] arr2) {
        HashMap<List<Integer>, List<Integer>> outcome = new HashMap<>();
        List<Integer> key = new ArrayList<>();
        List<Integer> value = new ArrayList<>();

        for (int a : arr) {
            for (int b : arr2) {
                if (a != b) {
                    key.add(a);
                    value.add(b);
                }
            }
        }
        outcome.put(key, value);
        //System.out.print(Arrays.toString(outcome.entrySet().toArray()));

        outcome.forEach((k,v)-> System.out.println(k+"\n"+v));

        /*
        its hard to get a multidimensional array since they are only supported in PHP.
        I have factored out the permutation (all possible array outcomes) of the array.

        The outcomes can be retrieved in (key,value) pair.
         */


    }


    public static void main(String[] args) {
        int[] arr = {1, 0, -1}; //game 1
        int[] arr2 = arr; //game 2
        combine(arr, arr2);

    }
}


