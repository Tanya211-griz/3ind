// интерфейс Liner  для решения линейного уравнения ax+b = 0
public class Liner implements Root {
    private  double a, b;
    private String  root; //хранение результата


    public Liner(double a, double b)
    {
        this.a = a;
        this.b = b;

    }

    @Override
    public void vRoot()
    {
        if ((a == 0) && (b== 0))
            root = "бесконечно корней";
        if ((a == 0)&& (b!= 0))
            root = "нее корней";
        if (a != 0)
            root =  "корень:" + (-b / a);
    }

    @Override
    public  void pRoot()
    {
        System.out.println("Линеное уравнение: " + root);
    }
}
