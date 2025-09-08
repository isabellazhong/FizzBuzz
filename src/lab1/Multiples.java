package lab1;

public class Multiples {
    public static void main(String[] args){
        multiples(1000,3,5);
    }

    public static int multiples() {
        return multiples(1000,3,5);
    }

    public static int multiples(int m, int a, int b) {
        int counter = 0;
        for (int i=1; i<m; i++) {
            if (i%a==0 || i%b==0) {
                counter++;
            }
        }

        System.out.println(counter);
        return counter;
    }
}
