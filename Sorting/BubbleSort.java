package Sorting;

public class BubbleSort {
    static void main() {
        int[] arr = {1,2,3,4,5,6};

        for(int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;

            for(int j = 0; j < arr.length - i - 1; j++) {

                if(arr[j] < arr[j + 1]) {
                    // Already correct order, ignore
                }

                else if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if(swapped == false) {
                break;
            }
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
