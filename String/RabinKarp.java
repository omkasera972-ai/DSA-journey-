package String;

public class RabinKarp {
    public static void main(String[] args) {
        String text = "ababcabcabababd";
        String pattern = "ababd";

        int n = text.length();
        int m = pattern.length();

        int base = 256;
        int mod = 101;

        int patternHash = 0;
        int windowHash = 0;
        int h = 1;

        // Calculate h = base^(m-1) % mod
        for (int i = 0; i < m - 1; i++) {
            h = (h * base) % mod;
        }

        // Calculate initial hashes
        for (int i = 0; i < m; i++) {
            patternHash = (base * patternHash + pattern.charAt(i)) % mod;
            windowHash = (base * windowHash + text.charAt(i)) % mod;
        }

        // Slide the window over the text
        for (int i = 0; i <= n - m; i++) {

            // Compare hashes
            if (patternHash == windowHash) {

                // Verify characters to avoid hash collision
                int j = 0;

                while (j < m &&
                        text.charAt(i + j) == pattern.charAt(j)) {
                    j++;
                }

                if (j == m) {
                    System.out.println("Pattern found at index " + i);
                }
            }

            // Calculate hash for the next window
            if (i < n - m) {
                windowHash = (base * (windowHash
                        - text.charAt(i) * h)
                        + text.charAt(i + m)) % mod;

                if (windowHash < 0) {
                    windowHash += mod;
                }
            }
        }
    }
}
