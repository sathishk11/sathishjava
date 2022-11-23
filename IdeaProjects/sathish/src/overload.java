import java.util.Scanner;

public class overload {
    public static int cal(int x, int y, int b) {
        int add=x+y+b;
        return add;
    }
    public static int cal(int x, int y) {
        int sub = x - y;
        return sub;
    }
    public static int cal(int x, int y, int b, int d) {
        int multi = x * y * d * b;
        return multi;
    }
    public int cal(int x, int y, int b, int d, int e) {
        int div = (x + y + b + d) / e;
        return div;
    }
    public String cal(String str) {
        String st1 = str.toUpperCase();
        return st1;
    }

    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        System.out.println("enter the value x:");
        int x=st.nextInt();
        Scanner st1=new Scanner(System.in);
        System.out.println("enter the value y:");
        int y=st1.nextInt();
        Scanner st2=new Scanner(System.in);
        System.out.println("enter the value b:");
        int b=st2.nextInt();
        Scanner st3=new Scanner(System.in);
        System.out.println("enter the value d:");
        int d=st3.nextInt();
        Scanner st4=new Scanner(System.in);
        System.out.println("enter the value e:");
        int e=st4.nextInt();
        System.out.println("add="+cal(x,y,b));
        System.out.println("sub="+cal(x,y));
        System.out.println("multi="+cal(x,y,b,d));
        overload ob=new overload();
        System.out.println("div="+ob.cal(x,y,b,d,e));
        System.out.println(ob.cal("moolya"));
    }
}