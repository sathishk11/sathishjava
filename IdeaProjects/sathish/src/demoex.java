import java.util.Scanner;
public class demoex {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a= in.nextInt();
        System.out.println("enter the value of b:");
        int b= in.nextInt();
        System.out.println("enter the value of r:");
        int r= in.nextInt();
        System.out.println("enter the case:");
        int num=in.nextInt();
        switch (num){
            case 1 -> Sample.add(a,b);
            case 2 -> Sample.sub(a,b);
            case 3 -> Sample.multi(a,b);
            case 4 -> Sample.Divide(a,b);
            case 5 -> Sample.area(r);
        }

    }
}
class Sample {
    public static void add(int a, int b) {
        int z;
        z = a + b;
        System.out.println("addition="+z);
    }
    public static void Divide(int a, int b){
        double  z;
        if(a>b){
        z = a / b;
        } else
        {
            z=b / a;
        }
        System.out.println("Division="+z);
    }
    public static void sub(int a, int b) {
        int z;
        if(a>b){
            z=a-b;
        }else
        {
            z=b-a;
        }
        System.out.println("Subtraction="+z);
    }
    public static void multi(int a, int b) {
        int z;
        z = a * b;
        System.out.println("multiplication="+z);
    }
    public static void area(double r) {
        double z;
        z = 3.14*r*r;
        System.out.println("area of the circle="+z);
    }
}


