import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {
        inputValues();

    }

    static void inputValues() {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Ededler araligini secin (artan ardicilliq):");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a < b) {
            primeInt(a, b);
        } else {
            System.err.println("Ededleri artan ardicilliqla yazin!\n");
            inputValues();
        }
    }

    static void primeInt(int value1, int value2) {
        while (value1 <= value2) {
            int y = 2;
            while (y <= value1) {
                if (value1 == y) {
                    System.out.println(value1);
                }
                if (value1 % y == 0) {
                    break;
                }
                y++;
            }
            value1++;
        }
    }
}
