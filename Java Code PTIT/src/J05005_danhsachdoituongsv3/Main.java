package J05005_danhsachdoituongsv3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<SinhVien> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new SinhVien(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(a);
        for(SinhVien x : a){
            System.out.println(x.toString());
        }
    }
}
