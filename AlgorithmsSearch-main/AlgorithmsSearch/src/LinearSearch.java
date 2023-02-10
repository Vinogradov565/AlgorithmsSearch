import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearSearch {
    public static int linearSearch( int target) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(5, 3, 2, 4, 1, 8, 9, 6, 7, 10));

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == target) {
                return i;
            }
            System.out.println(arr);
        }

        return -1;
    }
}