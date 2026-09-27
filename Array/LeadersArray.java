class LeaderArr {
    static void findLeader(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

public class LeadersArray {
    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 2, 5, 2 };

        LeaderArr.findLeader(arr);
    }
}
