package P7;
import java.util.*;
public class Q1 {
    public static Integer fRE(int[]a) {
        HashSet<Integer> seen = new HashSet<>();
        for (int elem : a) {
            if (seen.contains(elem)) {
                return elem;
            }
            seen.add(elem);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,52,4,2,9};
        System.out.println(fRE(arr));
    }  
}
