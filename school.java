import java.util.Scanner;

class student{
    String n1,n3; int n2; int english; int maths; int gk;
    public double details(String n1,int n2,String n3,int m1,int m2,int m3)
    {
        System.out.println("NAME:" +n1);
        System.out.println("ROLLNUMBER:"+n2);
        System.out.println("CLASS:" +n3);
        english=m1;
        maths=m2;
        gk=m3;
        double AVG=(m1+m2+m3)/3;
        System.out.println("m1:" +m1); System.out.println("m2:" +m2); System.out.println("m3:" +m3);
        System.out.println("total=" +(m1+m2+m3)+"/300");
        System.out.println("AVG=" +AVG);
        if(AVG>35){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        return AVG;
    }
    static void print(){
        System.out.println("---------------------");
    }
}
public class school {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=c.nextInt();
        student a=new student();
        student b=new student();
        switch (num){
            case 1 -> {
                student.print();
                double one=a.details("suresh",10001,"A",78,89,95);
                student.print();
            }
            case 2 -> { student.print();
                double two =b.details("prakash",10002,"A",32,33,12);
                student.print();
            }

        }
    }
}
