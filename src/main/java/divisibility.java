import java.util.Scanner;

public class divisibility {
    public static void main(String[] args) {
        input();
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededleri daxil edin (birinci musbet tam eded, ikinci musbet tam eded ve bolen musbet tam eded):");

        int value1 = sc.nextInt();
        int value2 = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;
        if (value1 > value2 || x <= 0 || value1 <= 0) {
            System.err.println("Birinci ve ikinci ededleri artan ardicilliqla yazin!");
            System.err.println("Bolen musbet tam eded olmalidir!\n");
            input();
        } else {
            find(value1, value2, x, count);
        }
    }

    static void find(int value1, int value2, int x, int count) {
        while (value1 <= value2) {
            if (value1 % x == 0) {
                count++;
            }
            value1++;
        }
        System.out.println(count);
    }
}
