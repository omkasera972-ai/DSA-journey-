import static java.lang.IO.print;

void reverse(int arr[], int start, int end) {

    while (start < end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }
}

void main() {

    int arr[] = {1,2,3,4,5,6,7};
    int n = arr.length;
    int k = 2;

    IO.println("Before Rotate:-");

    for(int num : arr) {
        IO.print(num + " ");
    }


    reverse(arr, 0, n - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, n - 1);

    IO.println();

    IO.println("\nAfter Rotate:- ");
    for (int i = 0; i < arr.length; i++) {
        print(arr[i] + " ");
    }
}