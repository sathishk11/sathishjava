import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        int i=0;
//        while (i < 10) {
//            System.out.println(b*i);
//            i++;
//        }
        do {
            System.out.println(b*i);
            i++;
        } while(i<=7);
    }
}