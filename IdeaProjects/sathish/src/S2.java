import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner in= new Scanner(System.in);
        int age= in.nextInt();
        switch (age){
            case 1 : System.out.println("retirement");
            case 2 : System.out.println("focus on your job");
            case 3 : System.out.println("study hard");
            default: System.out.println("enjoy your life");
        }

            }


}
