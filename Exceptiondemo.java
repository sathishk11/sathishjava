public class Exceptiondemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c= 0;
        System.out.println("Good morning");
        try {
            int arr[]= {23,20,33,45};
            c = a / b;
            System.out.println("the array value is "+arr[4]);
        }catch (ArithmeticException e) {
            System.err.println("ArithmeticException");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        }catch (Exception e){
            System.err.println("Error occured");
        }finally {
            System.out.println("program goes to end");
        }
        System.out.println("value of c is "+c);
        System.out.println("end the program");
    }
}