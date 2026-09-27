class Equilibrium {
    static void eq(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int leftsum = 0;
            int rightsum = 0;

            for (int j = 0; j < i; j++) {
                leftsum = leftsum + arr[j];
            }

            for (int k = i + 1; k < arr.length; k++) {
                rightsum = rightsum + arr[k];
            }
            if (leftsum == rightsum) {
                System.out.print("Equilivbrium index:- " + i);
                return;
            }
        }
        System.out.println("No Equilibrium index");
    }
}

public class Find_equilibrium_index {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 5, 3, 1 };

        Equilibrium.eq(arr);
    }
}