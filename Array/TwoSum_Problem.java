class TwoSum {
    static void sum(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("[ " + i + ", " + j + " ]" + " indexes Sum is- " + target);
                    return;
                }
            }
        }
    }
}

public class TwoSum_Problem {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 10, 4, 6 };
        int target = 5;

        TwoSum.sum(arr, target);
    }
}
