import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02105_DanhSachKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>[] adj = new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int x=sc.nextInt();
                if(x==1){
                    adj[i].add(j);
                }
            }
        }
        for(int i=1;i<=n;i++){
            System.out.printf("List(%d) = ",i);
            for(int j:adj[i]){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
