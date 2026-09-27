class Pair {
    static void sum(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        System.out.print("Total pairs are:- " + count);
    }
}

public class CountPairSum {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, 2, 11 };
        int target = 9;
        Pair.sum(arr, target);
    }
}
