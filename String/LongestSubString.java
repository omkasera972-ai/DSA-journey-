package String;

public class LongestSubString {
    public static void main(String[] args) {
        int arr[] = new int[ 256];
        String s = "abcdab";
        int start = 0;
        int max = 0;

        for(int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            while(arr[ch] == 1) {
                arr[s.charAt(start)] = 0;
                start++;
            }
            arr[ch] = 1;

            int length = end - start + 1;


            if(length > max) {
                max = length;
            }
        }
        System.out.println(max);
    }
}