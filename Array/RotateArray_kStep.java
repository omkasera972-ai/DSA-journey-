// QUE- Rotate array by k steps

class Reverse {
    static void rev(int arr[], int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }
}

public class RotateArray_kStep {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int n = arr.length;

        Reverse.rev(arr, 0, n - 1);
        Reverse.rev(arr, 0, k - 1);
        Reverse.rev(arr, k, n - 1);

        // print

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}