import java.util.Scanner;

public class J01013_TongUocSo {
    public static Scanner sc = new Scanner(System.in);
    public static final int N = (int) 2e6;
    public static int[] prime = new int[N + 5];
    public static void findMinDivisor() {
        for (int i = 2;i<=Math.sqrt(N); i++) {
            if (prime[i] == 0) {
                for (int j = i; j <= N; j += i) {
                    if (prime[j] == 0) {
                        prime[j] = i;
                    }
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            if (prime[i] == 0) {
                prime[i] = i;
            }
        }
    }
    public static int sumOfDiviseur(int n){
        if(prime[n]==0) return n;
        int sum=0;
        while(n!=1){
            sum+=prime[n];
            n/=prime[n];
        }
        return sum;
    }
    public static void main(String[] args) {
        findMinDivisor();
        int n=sc.nextInt();
        long sum=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            sum+=sumOfDiviseur(x);
        }
        System.out.println(sum);
    }
}
