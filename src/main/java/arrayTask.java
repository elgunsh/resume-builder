import java.util.Arrays;
import java.util.Scanner;

public class arrayTask {
    public static void main(String[] args) {
        input();
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivdeki elementlerin sayini daxil edin:");
        int n = sc.nextInt();
        System.out.println("Necenci elementi cap etmek isteyirsiniz?");
        int k = sc.nextInt();
        int[] arr = new int[n];

        fillArr(n, arr);

        sortArr(k, arr); //or
//      ascendingArr(n, k, arr);

    }

    static void fillArr(int n, int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivin elementlerini daxil edin:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static void sortArr(int k, int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[k - 1]);
    }

    static void ascendingArr(int n, int k, int[] arr) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[k - 1]);
    }
}
