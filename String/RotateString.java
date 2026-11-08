
void main() {

    String s1 = "ABCD";
    String s2 = "CDAB";

    if (s1.length() != s2.length()) {
        System.out.println(false);
        return;
    }

    String temp = s1 + s1;

    if (temp.contains(s2)) {
        System.out.println(true);
    } else {
        System.out.println(false);
    }
}
