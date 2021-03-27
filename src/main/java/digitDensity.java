import java.util.Arrays;
import java.util.Scanner;

public class digitDensity {
    public static void main(String[] args) {
        while (true) {
            input();
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int value = sc.nextInt();

        int digit = 0;
        int number = 0;
        int[] m = new int[10];

        repeate(digit, value, number, m);
    }

    static void repeate(int digit, int value, int number, int[] m) {
        while (true) {
            digit = value % 10;
            number = value / 10;
            value = number;
            m[digit] = m[digit] + 1;
            if (value == 0) break;
        }
        System.out.println(Arrays.toString(m));
    }
}
