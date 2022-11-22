import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner ab= new Scanner(System.in);
        System.out.println("enter your string:");
        String str= ab.next();
        int j;
        for(j=0; j<str.length(); j++){
            j++;
        }System.out.println(+j);
    }
}
