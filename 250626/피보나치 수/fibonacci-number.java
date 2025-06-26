import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int[] f = new int[n+1];
        f[1]=1;
        f[2]=1;
        for(int i=3; i<n+1; i++){
            f[i]= f[i-1]+f[i-2];
        }

        System.out.println(f[n]);
        
    }
}