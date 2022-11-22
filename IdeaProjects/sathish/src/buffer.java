import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class buffer {
    public static void main(String[] args) throws IOException {
        int i; int j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("enter the value i:",i=Integer.parseInt(br.readLine()));
        System.out.println(i);
        System.out.printf("enter the value j:",j=Integer.parseInt(br.readLine()));
        System.out.println(j);
        System.out.println("output:");
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j);
        System.out.println(i%j);
    }
}
