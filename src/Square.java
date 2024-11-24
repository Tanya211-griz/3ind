public class Square implements Root {
   private double a, b, c;
private String root;
    Square(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void vRoot()
    {
        double disk = b*b - 4*a*c;
        if (disk > 0) {
            double x1 = (-b + Math.sqrt(disk)) /( 2*a);
            double x2 = (-b - Math.sqrt(disk)) /( 2*a);

            root = "x1 = " + x1 + "x2 = "  + x2;

        }
        if (disk < 0)
            root = "нет корней" ;
        if (disk == 0) {
            double x = -b/2*a;
            root = "x= " + x;
        }
    }

    public void pRoot(){
        System.out.println("Квадратное уравнение" + root);
    }
}
