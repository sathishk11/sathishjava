import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        //       for (int i=1; i<20; i++){
        //         System.out.println(i*2);
        int c = 0;
        Scanner name = new Scanner(System.in);
        System.out.println("enter your string");
        String scr = name.nextLine();
        char[] ch = scr.toCharArray();
        System.out.println(ch.length);
    }
}

