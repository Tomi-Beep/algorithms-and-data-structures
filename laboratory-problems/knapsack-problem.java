import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, T = 40;
        n = sc.nextInt();
        int[] vreme = new int[n];
        int[] zarabotka = new int[n];
        for (int i = 0; i < n; i++) {
            vreme[i] = sc.nextInt();
            zarabotka[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (zarabotka[i] / vreme[i] < zarabotka[j] / vreme[j]) {
                    int temp = vreme[i];
                    vreme[i] = vreme[j];
                    vreme[j] = temp;
                    temp = zarabotka[i];
                    zarabotka[i] = zarabotka[j];
                    zarabotka[j] = temp;
                }
            }
        }
        int max_zarabotka = 0;
        for (int i = 0; i < n; i++) {
            if (T < vreme[i]) {
                max_zarabotka += zarabotka[i] / vreme[i] * T;
                T = 0;
            } else {
                max_zarabotka += zarabotka[i];
                T -= vreme[i];
            }
            if (T == 0) {
                break;
            }
        }
        System.out.println(max_zarabotka);
    }
}
