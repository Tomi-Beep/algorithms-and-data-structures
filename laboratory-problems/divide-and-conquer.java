import java.util.Scanner;

public class Main {

    public static int binarnoPrebaruvanje(int[] arr, int left, int right, int M) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == M) {
                return mid;
            }
          
            if (arr[mid] > M) {
                return binarnoPrebaruvanje(arr, left, mid - 1, M);
            }
           
            return binarnoPrebaruvanje(arr, mid + 1, right, M);
        }
     
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int result = binarnoPrebaruvanje(arr, 0, N - 1, M);
        
        if (result == -1) {
            System.out.println("Ne postoi");
        } else {
            System.out.println(result);
        }
        
    }
}
