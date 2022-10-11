import java.util.Scanner;
import java.math.*;


public class hipovealan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double a , b ;
        System.out.print("Birinci Kenar : ");
        a = scanner.nextInt();
        System.out.print("Ikinci Kenar : ");
        b= scanner.nextInt();
        double h = Math.sqrt(a*a+b*b);
        System.out.println("Hipotenus = " + h);

        double u;
        double alan;
        double s;
        u = ((a+b+h)/2);
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-h));
        System.out.println("ucgenin alani= " + alan);












    }
}

