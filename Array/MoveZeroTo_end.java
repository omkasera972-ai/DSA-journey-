class Zero {
    static void zero(int arr[]) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }
}

public class MoveZeroTo_end {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 3, 0, 5, 0, 9 };

        Zero.zero(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
