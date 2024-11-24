import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Root[] f;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        f = new Root[k];
        for (int i = 0; i < k; i++)
        {
            System.out.println("1 - Линейное уравнение, 2 - Квадратное уравнение");
            int p = sc.nextInt();

            if (p==1)
            {
                System.out.println("Введите 2 переменные");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                Liner liner= new Liner(a,b);
                f[i] = liner;
            }
            if (p==2)
            {
                System.out.println("Введите 3 переменные");
                double a1 = sc.nextDouble();
                double b1 = sc.nextDouble();
                double c1 = sc.nextDouble();
                 Square square= new Square(a1,b1, c1);
                f[i] = square;
            }

        }

    }
}