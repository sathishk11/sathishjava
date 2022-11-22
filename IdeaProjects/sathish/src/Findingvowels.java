import java.util.Scanner;

public class Findingvowels {
    public static void main(String args[]) {
        Scanner ch=new Scanner(System.in);
        System.out.println("enter the string:");
        String str = ch.nextLine();
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                System.out.println("Given string contains "+str.charAt(i)+" at the index "+i);
            }
        }
    }
}

