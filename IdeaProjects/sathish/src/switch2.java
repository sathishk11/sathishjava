import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 60)
        {
            System.out.println("retirement");
        }
        else if (num >= 30 && num <= 60)
        {
            System.out.println("focus on your job");
        }
        else if (num >= 20 && num <= 30)
        {
            System.out.println("study hard");
        }
        else {
            System.out.println("enjoy your life");
        }
    }
}

