import javax.swing.plaf.synth.SynthOptionPaneUI;

public class string {
    public static void main(String[] args) {
        String str="thiruvananthapuram";
        String str1="THIRUVANANTHAPURAM";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.replace("a","z"));
        System.out.println(str.charAt(4));
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.endsWith("e"));
    }
}
