import java.util.Scanner;

public class denemeAlan {
    public static void main(String[] args) {
        int a, b, c;
        double alan, s;
        

        Scanner input = new Scanner(System.in);

        System.out.println("1. Kenar : ");
        a = input.nextInt();
        System.out.println("2. Kenar : ");
        b = input.nextInt();
        System.out.println("3. Kenar : ");
        c = input.nextInt();

        s = (a+b+c)/2;
        alan = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Ucgenin Alani : " + alan);


    }
}
