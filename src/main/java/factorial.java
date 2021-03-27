import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        input();
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int num = sc.nextInt();
        if (num < 0 || num > 20) {
            System.err.println("Eded 0-20 intervalinda olmalidir!");
            input();
        } else {
            System.out.println(factorialIt(num));
            System.out.println(factorialRe(num));
        }
    }

    static long factorialIt(int num) {
        long res = 1;
        if (num == 0) {
            return res;
        }
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    static long factorialRe(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorialIt(num - 1);
    }
}
