import java.util.*;

class Unions {
    static void union(int arr1[], int arr2[]) {
        int left = 0, right = 0;

        // Union
        List<Integer> res = new ArrayList();

        while (left < arr1.length || right < arr2.length) {

            // Skip duplicate
            while (left > 0 && left < arr1.length && arr1[left] == arr1[left - 1]) {
                left++;
            }
            while (right > 0 && right < arr2.length && arr2[right] == arr2[right - 1]) {
                right++;
            }

            // One Array Exhaust
            if (left >= arr1.length) {
                res.add(arr2[right]);
                right++;
                continue;
            }
            if (right >= arr2.length) {
                res.add(arr1[left]);
                left++;
                continue;
            }

            // Comparision
            if (arr1[left] < arr2[right]) {
                res.add(arr1[left]);
                left++;
            } else if (arr1[left] > arr2[right]) {
                res.add(arr2[right]);
                right++;
            } else { // equal
                res.add(arr1[left]);
                left++;
                right++;
            }
        }
        System.out.print(res);
    }
}

public class Union {
    public static void main(String[] args) {
        int arr1[] = { 1, 1, 1, 2, 2, 3, 3, 3 };
        int arr2[] = { 3, 3, 4 };

        Unions.union(arr1, arr2);
    }
}