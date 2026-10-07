import static java.lang.IO.print;

@FunctionalInterface
interface Rotate {
    void rotate(int arr[], int start, int end);
}

Rotate obj = (arr,start,end) -> {

    while (start < end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }
};

void main() {
    int arr[] = {1,2,3,4,5,6,7};
    int n = arr.length;
    int k = 3;

    obj.rotate(arr,0,n-1);
    obj.rotate(arr,0,k-1);
    obj.rotate(arr,k,n-1);

    for(int i = 0; i < arr.length; i++) {
        print(arr[i] + " ");
    }
}
