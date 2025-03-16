import java.util.Scanner;


public class LDS {
	

	private static int najdolgaOpagackaSekvenca(int[] a) {
        
        int max = 1;
        int []b = new int[a.length];
        for(int i = 0; i < a.length; i++){
            b[i]=1;
        }
        
        for(int i = 1; i < a.length; i++){
            for(int j = 0; j < i; j++){
                if(a[j]>a[i]&&(b[j]+1)>b[i]){
                    b[i]=b[j]+1;
                }
            }
        }
        
        for(int i = 0; i < b.length; i++){
            max = Math.max(max,b[i]);
        }
        
    return max;
    }
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = stdin.nextInt();
		}
		System.out.println(najdolgaOpagackaSekvenca(a));
	}


}
