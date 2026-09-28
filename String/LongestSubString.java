package String;

class SubString {
    static void subString(String s) {
        boolean[] seen = new boolean[256];

        int left = 0;
        int right = 0;
        int max = 0;

        while (right < s.length()) {

            char ch = s.charAt(right);

            if (!seen[ch]) {
                seen[ch] = true;
                right++;

                max = Math.max(max, right - left);

            } else {
                seen[s.charAt(left)] = false;
                left++;
            }
        }

        System.out.println(max);
    }
}

public class LongestSubString {
    public static void main(String[] args) {

        String s = "abcabcbb";

        SubString.subString(s);

    }
}