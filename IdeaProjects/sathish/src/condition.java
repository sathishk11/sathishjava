public class condition {
    public static void main(String[] args) {
        int i=10;
        int j=12;
        int z=34;
        System.out.println(++i);
        System.out.println(i++);
        System.out.printf("i=",i);
        System.out.println(--j);
        System.out.println(i==j || i>z);
        System.out.println(i==j && i<z);

        System.out.println(i>j || i>z);
        System.out.println(i>j && i<z);
    }
}
