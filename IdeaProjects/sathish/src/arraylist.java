import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("hello"); arr.add("moolyaed"); arr.add("welcome");
        System.out.println(arr);
        arr.add(3,"all");
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());
        arr.remove(3);
        System.out.println(arr.get(1));

    }
}
