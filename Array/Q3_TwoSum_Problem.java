import static java.lang.IO.print;

class TwoSum {
    static void sum(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    print("[ " + i + ", " + j + " ]" + " indexes Sum is- " + target);
                    return;
                }
            }
        }
    }
}

void main() {
    int arr[] = { 3, 2, 10, 4, 6 };
    int target = 5;

    TwoSum.sum(arr, target);
}

