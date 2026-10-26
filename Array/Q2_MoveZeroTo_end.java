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

    // More easy Approach:=
    /*
    public class Move0ToEnd {

    static void getMove(int arr[]) {
        int index = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

                index++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,6,0,0};

        getMove(arr);

        for(int i = 0; i < arr.length; i++) {
            IO.print(arr[i] + " ");
        }
    }
}

      */

