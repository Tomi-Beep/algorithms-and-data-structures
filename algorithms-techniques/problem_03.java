import java.util.Arrays;
import java.util.Scanner;

public class chillinnn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int[] pozSvetilki = new int[N];

        for (int i = 0; i < N; i++) {
            pozSvetilki[i] = input.nextInt();
        }
        Arrays.sort(pozSvetilki);
        int counter = 0;
        for (int i = 0, pos = pozSvetilki[0]; i < N && pos <= M; i++) {
            if (pozSvetilki[i] == pos) {
                counter++;
                pos += 5;
                while (i < N && pozSvetilki[i] < pos) {
                    i++;
                }
                if (i < N) {
                    pos = pozSvetilki[i];
                    i--;
                }
            }
        }
        System.out.println(counter);
    }
}
