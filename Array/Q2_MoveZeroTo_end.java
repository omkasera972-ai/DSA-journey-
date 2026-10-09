import static java.lang.IO.print;

@FunctionalInterface
interface Zero {
    void zero(int[] arr);
}

Zero obj = (arr) -> {
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
};


void main() {
        int[] arr = { 1, 0, 3, 0, 5, 0, 9 };

        obj.zero(arr);

        for (int i = 0; i < arr.length; i++) {
            print(arr[i] + " ");
        }
    }

