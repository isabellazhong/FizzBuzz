package lab1;

public class Reduce {
    public static void main(String[] args) {
        reduce(100);
    }

    public static int reduce(int n) {
        int counter = 0;
        while (n > 0) {
            if (n%2==0) {
                n = n/2;
            } else {
                n -= 1;
            }
            counter++;
        }
        System.out.println(counter);
        return counter;
    }
}
