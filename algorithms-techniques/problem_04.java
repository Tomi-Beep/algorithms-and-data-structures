import java.util.Arrays;
import java.util.Scanner;

public class MinimumPlatforms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of trains
        int n = scanner.nextInt();
        
        // Arrays to store arrival and departure times
        int[] arrival = new int[n];
        int[] departure = new int[n];
        
        // Read input
        for (int i = 0; i < n; i++) {
            arrival[i] = scanner.nextInt();
            departure[i] = scanner.nextInt();
        }
        
        // Find and print the result
        System.out.println(findMinimumPlatforms(arrival, departure, n));
    }
    
    public static int findMinimumPlatforms(int[] arrival, int[] departure, int n) {
        // Sort arrival and departure times
        Arrays.sort(arrival);
        Arrays.sort(departure);
        
        // Initialize pointers and variables
        int platformsNeeded = 0;
        int maxPlatforms = 0;
        int i = 0, j = 0;
        
        // Traverse through the events
        while (i < n && j < n) {
            // If a train arrives before or at the same time as another train departs
            if (arrival[i] <= departure[j]) {
                platformsNeeded++;
                maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
                i++;
            } else {
                // A train departs
                platformsNeeded--;
                j++;
            }
        }
        
        return maxPlatforms;
    }
}
