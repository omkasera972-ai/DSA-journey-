public static int powerOfTwo(int n) {

    if(n < 0) {
       IO.println("Illegal input");
       return -1;
        }

    if(n == 0) {
        return 1;
    }

    return 2 * powerOfTwo(n-1);
}

void main() {
    int n = -1;

    int result = powerOfTwo(n);

    IO.print(result + " ");
}