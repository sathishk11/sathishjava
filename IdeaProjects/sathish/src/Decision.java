import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Decision {
    public static void main(String[] args) throws IOException {
        Scanner in= new Scanner(System.in);
        System.out.printf("First subject mark :");
       int num1 = in.nextInt();
        System.out.printf("Second subject mark :");
        int num2 = in.nextInt();
        System.out.printf("Third subject mark :");
        int num3 = in.nextInt();
        System.out.printf("Fourth subject mark :");
        int num4 = in.nextInt();
        System.out.printf("Fifth subject mark :");
        int num5 = in.nextInt();
        double avg=(num1+num2+num3+num4+num5)/5;
        System.out.printf("Average mark is:" + avg);

        if (avg>=90 && avg<=100)
        {
            System.out.println("you will get bicycle");
        }
        else if (avg > 70 && avg < 90)
        {
            System.out.println("you will get chocolates");
        }
        else {
            System.out.println("study hard");
        }
    }
}