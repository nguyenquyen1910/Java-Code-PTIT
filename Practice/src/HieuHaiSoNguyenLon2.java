import java.math.BigInteger;
import java.util.Scanner;

public class HieuHaiSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.subtract(b));
    }
}
